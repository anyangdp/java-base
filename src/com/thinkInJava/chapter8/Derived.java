package com.thinkInJava.chapter8;

/**
 * @Author anyang
 * @CreateTime 2019/3/27
 * @Des
 */
public class Derived extends PrivateOverride {
    public void f() {
        System.out.println("Derived f()");
    }

    @Override
    public void f2() {
        System.out.println("Derived f2()");
    }
}
