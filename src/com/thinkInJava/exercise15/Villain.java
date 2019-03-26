package com.thinkInJava.exercise15;

/**
 * @Author anyang
 * @CreateTime 2019/3/26
 * @Des
 */
public class Villain {
    private String name;

    public Villain(String name) {
        this.name = name;
    }

    protected void set(String nm) {
        name = nm;
    }

    @Override
    public String toString() {
        return "Villain{" +
                "name='" + name + '\'' +
                '}';
    }
}