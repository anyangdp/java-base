package com.thinkInJava.chapter14.dynamicProxy;

/**
 * @Author anyang
 * @CreateTime 2019/4/8
 * @Des
 */
public class SimpleProxy implements Interface {
    private Interface proxied;

    public SimpleProxy(Interface proxied) {
        this.proxied = proxied;
    }

    @Override
    public void doSomething() {
        System.out.println("SimpleProxy doSomething");
        proxied.doSomething();
    }

    @Override
    public void somethingElse(String arg) {
        System.out.println("SimpleProxy somethingElse");
        proxied.somethingElse(arg);
    }
}
