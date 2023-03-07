package com.design.大话设计模式.装饰器模式;

/**
 * @Author anyang
 * @CreateTime 2023/3/7
 * @Des
 */
public class Person {
    public Person() {
    }

    public Person(String name) {
        this.name = name;
    }

    private String name;
    public void show() {
        System.out.println("装扮的"+name);
    }
}
