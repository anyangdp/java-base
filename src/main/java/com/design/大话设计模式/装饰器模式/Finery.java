package com.design.大话设计模式.装饰器模式;

/**
 * @Author anyang
 * @CreateTime 2023/3/7
 * @Des
 */
public class Finery extends Person{
    private Person component;
    public void decorate(Person component) {
        this.component = component;
    }
    @Override
    public void show() {
        component.show();
    }
}
