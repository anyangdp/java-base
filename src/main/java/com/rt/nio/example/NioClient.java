package com.rt.nio.example;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CountDownLatch;

/**
 * @Author anyang
 * @CreateTime 2019/9/16
 * @Des
 */
public class NioClient {
    private SocketChannel clientSocketChannel;
    private Selector selector;
    private final List<String> responseQueue = new ArrayList<String>();

    private CountDownLatch connected = new CountDownLatch(1);

    public NioClient() throws IOException, InterruptedException {
        // 打开 Client Socket Channel
        clientSocketChannel = SocketChannel.open();
        // 配置为非阻塞
        clientSocketChannel.configureBlocking(false);
        // 创建 Selector
        selector = Selector.open();
        // 注册 Server Socket Channel 到 Selector
        clientSocketChannel.register(selector, SelectionKey.OP_CONNECT);
        // 连接服务器
        clientSocketChannel.connect(new InetSocketAddress(8000));
        new Thread(() -> {
            try {
                handleKeys();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }).start();
        if (connected.getCount() != 0) {
            connected.await();
        }
        System.out.println("Client 启动完成");
    }


    @SuppressWarnings("Duplicates")
    private void handleKeys() throws IOException {
        while (true) {
            // 通过 Selector 选择 Channel
            int selectNums = selector.select(30 * 1000L);
            if (selectNums == 0) {
                continue;
            }
            System.out.println("选择 Channel 数量：" + selectNums);

            // 遍历可选择的 Channel 的 SelectionKey 集合
            Iterator<SelectionKey> iterator = selector.selectedKeys().iterator();
            while (iterator.hasNext()) {
                SelectionKey key = iterator.next();
                iterator.remove();
                if (!key.isValid()) {
                    continue;
                }
                handleKey(key);
            }

        }
    }

    private void handleKey(SelectionKey key) throws IOException {
        // 接受连接就绪
        if (key.isAcceptable()) {
            handleAcceptableKey(key);
        }
        // 读就绪
        if (key.isReadable()) {
            handleReadableKey(key);
        }
        // 写就绪
        if (key.isWritable()) {
            handleWritableKey(key);
        }
    }

    private void handleAcceptableKey(SelectionKey key) throws IOException {
        // 接受 Client Socket Channel
        SocketChannel clientSocketChannel = ((ServerSocketChannel)key.channel()).accept();
        // 配置为非阻塞
        clientSocketChannel.configureBlocking(false);
        // log
        System.out.println("接受新的 Channel");
        // 注册 Client Socket Channel 到 Selector
        clientSocketChannel.register(selector, SelectionKey.OP_READ, new ArrayList<String>());
    }

    private void handleReadableKey(SelectionKey key) throws IOException {
        // Client Socket Channel
        SocketChannel clientSocketChannel = (SocketChannel) key.channel();
        // 读取数据
        ByteBuffer readBuffer = CodecUtil.read(clientSocketChannel);
        // 处理连接已经断开的情况
        if (readBuffer == null) {
            System.out.println("断开 Channel");
            clientSocketChannel.register(selector, 0);
        }
        // 打印数据
        if (readBuffer.position() > 0) {// 写入模式下，
            String content = CodecUtil.newString(readBuffer);
            System.out.println("读取数据：" + content);

            // 添加到响应队列
            List<String> responseQueue = (List<String>) key.attachment();
            responseQueue.add("响应：" + content);
            // 注册 Client Socket Channel 到 Selector
            clientSocketChannel.register(selector, SelectionKey.OP_WRITE, key.attachment());
        }
    }

    @SuppressWarnings("Duplicates")
    private void handleWritableKey(SelectionKey key) throws ClosedChannelException {
        // Client Socket Channel
        SocketChannel clientSocketChannel = (SocketChannel) key.channel();
        // 遍历响应队列
        List<String> responseQueue = (List<String>) key.attachment();
        for (String content : responseQueue) {
            // 打印数据
            System.out.println("写入数据：" + content);
            // 返回
            CodecUtil.write(clientSocketChannel, content);
        }
        responseQueue.clear();
        // 注册 Client Socket Channel 到 Selector
        clientSocketChannel.register(selector, SelectionKey.OP_READ, responseQueue);
    }

    public synchronized void send(String content) throws ClosedChannelException {
        // 添加到响应队列
        responseQueue.add(content);
        // 打印数据
        System.out.println("写入数据：" + content);
        // 注册 Client Socket Channel 到 Selector
        clientSocketChannel.register(selector, SelectionKey.OP_WRITE, responseQueue);
        selector.wakeup();
    }

    public static void main(String[] args) throws IOException, InterruptedException {
        NioClient nioClient = new NioClient();
        for (int i = 0; i < 30; i++) {
            nioClient.send("nihao: " + i);
            Thread.sleep(1000L);
        }
    }
}
