package com.demo.多线程;

import java.lang.management.ManagementFactory;
import java.lang.management.ThreadInfo;
import java.lang.management.ThreadMXBean;

/**
 * @Author anyang
 * @CreateTime 2019/6/25
 * @Des
 */
public class MultiThread {
    public static void main(String[] args) {
        // 获取 Java 线程管理 MXBean
        ThreadMXBean threadMXBean = ManagementFactory.getThreadMXBean();
        // 不需要获取同步的 monitor 和 synchronizer 信息，仅获取线程和线程堆栈信息
        ThreadInfo[] threadInfos = threadMXBean.dumpAllThreads(false, false);
        // 遍历线程信息，仅打印线程 ID 和线程名称信息
        for (ThreadInfo threadInfo : threadInfos) {
            System.out.println("[" + threadInfo.getThreadId() + "] " + threadInfo.getThreadName());
        }


        Thread a1 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("thread a1");
            }
        });
        try {
            a1.start();
            a1.wait(2000);
            Thread.yield();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
