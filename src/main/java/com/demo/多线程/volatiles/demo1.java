package com.demo.多线程.volatiles;

/**
 * @Author anyang
 * @CreateTime 2019/8/16
 * @Des
 */
public class demo1  {

    public static int i = 0;

    public synchronized void increase(){
        i++;
    }


    public static void main(String[] args) throws InterruptedException {
        demo1 test = new demo1();

        for (int j = 0; j < 10; j++) {
            Thread t = new Thread(() -> {
                for(int j1 = 0; j1 <1000; j1++) {
                    test.increase();
                    System.out.println(test.i);
                }
            });
            t.start();
        }
    }
}
