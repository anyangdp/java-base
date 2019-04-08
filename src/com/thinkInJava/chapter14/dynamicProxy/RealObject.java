package com.thinkInJava.chapter14.dynamicProxy;

/**
 * @Author anyang
 * @CreateTime 2019/4/8
 * @Des
 */
public class RealObject implements Interface {
    public void doSomething() {
        System.out.println("doSomething"); }
    public void somethingElse(String arg) {
        System.out.println("somethingElse " + arg);
    }
}

