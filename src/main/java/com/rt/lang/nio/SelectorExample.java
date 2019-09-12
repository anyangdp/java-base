package com.rt.lang.nio;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;
import java.util.Iterator;
import java.util.Set;

/**
 * @Author anyang
 * @CreateTime 2019/9/12
 * @Des
 */
public class SelectorExample {
    public static void main(String[] args) throws IOException {
        // Get the selector
        Selector selector = Selector.open();
        System.out.println("Selector is open for makging connection: " + selector.isOpen());
        ServerSocketChannel ss = ServerSocketChannel.open();
        InetSocketAddress hostAddress = new InetSocketAddress("localhost", 8000);
        ss.bind(hostAddress);
        ss.configureBlocking(false);
        int ops = ss.validOps();
        SelectionKey selectionKey = ss.register(selector, ops, null);
        for (;;) {
            System.out.println("Waitging for the select operation...");
            int noOfkeys = selector.select();
            System.out.println("The Number of selected keys are: " + noOfkeys);
            Set selectedKeys = selector.selectedKeys();
            Iterator itr = selectedKeys.iterator();
            while (itr.hasNext()) {
                SelectionKey ky = (SelectionKey) itr.next();
                if (ky.isAcceptable()) {
                    // The new client connection is accepted
                    SocketChannel client = ss.accept();
                    client.configureBlocking(false);
                    // The new connection is added to a selector
                    client.register(selector, SelectionKey.OP_READ);
                    System.out.println("The new connection is accepted from the client: " + client);
                } else if (ky.isReadable()) {
                    // Data is read from the client
                    SocketChannel client = (SocketChannel) ky.channel();
                    ByteBuffer buffer = ByteBuffer.allocate(256);
                    client.read(buffer);
                    String output = new String(buffer.array()).trim();
                    System.out.println("Message read from client: " + output);
                    // The new connection is added to a selector
                    if (output.equals("Bye Bye")) {
                        client.close();
                        System.out.println("The client messages are complete; close the session.");
                    }
                }
                itr.remove();
            }
        }
    }
//    public static void main(String[] args) throws IOException {
//        // Get the selector
//        Selector selector = Selector.open();
//        System.out.println("Selector is open for making connection: " + selector.isOpen());
//        // Get the server socket channel and register using selector
//        ServerSocketChannel SS = ServerSocketChannel.open();
//        InetSocketAddress hostAddress = new InetSocketAddress("localhost", 8080);
//        SS.bind(hostAddress);
//        SS.configureBlocking(false);
//        int ops = SS.validOps();
//        SelectionKey selectKy = SS.register(selector, ops, null);
//        for (;;) {
//            System.out.println("Waiting for the select operation...");
//            int noOfKeys = selector.select();
//            System.out.println("The Number of selected keys are: " + noOfKeys);
//            Set selectedKeys = selector.selectedKeys();
//            Iterator itr = selectedKeys.iterator();
//            while (itr.hasNext()) {
//                SelectionKey ky = (SelectionKey) itr.next();
//                if (ky.isAcceptable()) {
//                    // The new client connection is accepted
//                    SocketChannel client = SS.accept();
//                    client.configureBlocking(false);
//                    // The new connection is added to a selector
//                    client.register(selector, SelectionKey.OP_READ);
//                    System.out.println("The new connection is accepted from the client: " + client);
//                } else if (ky.isReadable()) {
//                    // Data is read from the client
//                    SocketChannel client = (SocketChannel) ky.channel();
//                    ByteBuffer buffer = ByteBuffer.allocate(256);
//                    client.read(buffer);
//                    String output = new String(buffer.array()).trim();
//                    System.out.println("Message read from client: " + output);
//                    if (output.equals("Bye Bye")) {
//                        client.close();
//                        System.out.println("The Client messages are complete; close the session.");
//                    }
//                }
//                itr.remove();
//            } // end of while loop
//        } // end of for loop
//    }
}
