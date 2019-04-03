package com.thinkInJava.chapter9;

import java.util.Random;

/**
 * @Author anyang
 * @CreateTime 2019/3/29
 * @Des
 */
public interface Month {
//    int JANURY;
    Random RAND = new Random(10);
    int RANDINT = RAND.nextInt();

    public static void main(String[] args) {
        System.out.println(Month.RANDINT);
    }
}
