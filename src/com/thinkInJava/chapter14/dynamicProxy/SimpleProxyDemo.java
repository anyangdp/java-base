package com.thinkInJava.chapter14.dynamicProxy;

import java.lang.reflect.Proxy;

/**
 * @Author anyang
 * @CreateTime 2019/4/8
 * @Des
 */
public class SimpleProxyDemo {
    public static void consumer(Interface iface) {
        iface.doSomething();
        iface.somethingElse("bonobo");
    }

    public static void main(String[] args) {
//        SimpleProxyDemo.consumer(new RealObject());
//        SimpleProxyDemo.consumer(new SimpleProxy(new RealObject()));
//
        RealObject real = new RealObject();
//        consumer(real);

        Interface proxy = (Interface) Proxy.newProxyInstance(Interface.class.getClassLoader()
        ,new Class[]{Interface.class}, new DynamicProxyHandler(real));
        consumer(proxy);
    }
}
