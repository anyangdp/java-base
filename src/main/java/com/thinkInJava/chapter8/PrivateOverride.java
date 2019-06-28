package com.thinkInJava.chapter8;

/**
 * @Author anyang
 * @CreateTime 2019/3/27
 * @Des
 */
public class PrivateOverride {
    private void f() {
        System.out.println("private Override f()");
    }

    public void f2() {
        System.out.println("private f2");
    }

    public static void main(String[] args) {
        PrivateOverride privateOverride = new Derived();
        privateOverride.f2();
    }
}
