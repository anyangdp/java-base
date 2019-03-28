package com.thinkInJava.chapter8;

/**
 * @Author anyang
 * @CreateTime 2019/3/27
 * @Des
 */
public class Discription {
    private String s;

    public Discription(String s) {
        this.s = s;
        System.out.println("Creating Discription " + s);
    }

    protected void dispose() {
        System.out.println("disposing Discription " + s);
    }
}
