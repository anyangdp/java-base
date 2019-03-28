package com.thinkInJava.chapter8;

/**
 * @Author anyang
 * @CreateTime 2019/3/27
 * @Des
 */
public class Characteristic {

    private String s;

    public Characteristic(String s) {
        this.s = s;
        System.out.println("Creating Characteristic " + s);
    }

    protected void dispose() {
        System.out.println("disposing Characteristic " + s);
    }
}
