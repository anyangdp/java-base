package com.design.facadePattern;

/**
 * @Author anyang
 * @CreateTime 2018/3/20
 * @Des
 */
public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Rectangle::draw()");
    }
}
