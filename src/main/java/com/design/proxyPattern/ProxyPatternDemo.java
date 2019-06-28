package com.design.proxyPattern;

/**
 * @Author anyang
 * @CreateTime 2018/3/21
 * @Des
 */
public class ProxyPatternDemo {
    public static void main(String[] args) {
        Image image = new ProxyImage("test_10mb.jpg");
        image.display();
        Image image1 = new RealImage("test_dsda");
        image1.display();
    }
}
