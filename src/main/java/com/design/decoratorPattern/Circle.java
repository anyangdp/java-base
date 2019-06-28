package com.design.decoratorPattern;

/**
 * @Author anyang
 * @CreateTime 2018/3/20
 * @Des
 */
public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Shape: Circle");
    }
}
