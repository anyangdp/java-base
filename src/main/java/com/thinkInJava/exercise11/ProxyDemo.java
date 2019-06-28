package com.thinkInJava.exercise11;

/**
 * @Author anyang
 * @CreateTime 2019/3/26
 * @Des
 */
public class ProxyDemo {
    private Detergent detergent = new Detergent();
    public void fly() {
        detergent.fly();
    }

    public static void main(String[] args) {
        ProxyDemo p = new ProxyDemo();
        p.fly();
    }
}
