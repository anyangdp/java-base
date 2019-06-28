package com.demo.多线程;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @Author anyang
 * @CreateTime 2019/6/22
 * @Des
 */
public class AccountingSync implements Runnable {
    //共享资源(临界资源)
    static AtomicInteger i= new AtomicInteger(0);
    static int j= 0;

    /**
     * synchronized 修饰实例方法
     */
    public synchronized void increase(){
        i.addAndGet(1);
        j++;
    }
    @Override
    public void run() {
        for(int j=0;j<1000000;j++){
            increase();
        }
    }
    public static void main(String[] args) throws InterruptedException {
        AccountingSync instance=new AccountingSync();
        AccountingSync instance2=new AccountingSync();
        Thread t1=new Thread(instance);
        Thread t2=new Thread(instance);
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println(i);
        System.out.println(j);
    }
}
