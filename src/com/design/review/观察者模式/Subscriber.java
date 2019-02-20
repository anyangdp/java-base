package com.design.review.观察者模式;

/**
 * @Author anyang
 * @CreateTime 2019/2/20
 * @Des
 */
public interface Subscriber {
    int receive(String publisher, String articleName);
}
