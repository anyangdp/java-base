package com.design.decoratorPattern;

/**
 * @Author anyang
 * @CreateTime 2018/3/20
 * @Des
 */
public abstract class ShapeDecorator implements Shape {

    protected Shape decoratedShape;

    public ShapeDecorator(Shape decoratedShape) {
        this.decoratedShape = decoratedShape;
    }

    @Override
    public void draw() {
        decoratedShape.draw();
    }
}
