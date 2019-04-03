package com.thinkInJava.chapter10;

/**
 * @Author anyang
 * @CreateTime 2019/4/3
 * @Des
 */
public abstract class Base {
    public Base(int i) {
        System.out.println("Base constructor. i = " + i);
    }
    public abstract void f();
}
