package com.thinkInJava.chapter8;

/**
 * @Author anyang
 * @CreateTime 2019/3/27
 * @Des
 */
public class Amphibian extends Animal {
    private Characteristic characteristic = new Characteristic("can live in water");
    private Discription discription = new Discription("both water and land");

    public Amphibian() {
        System.out.println("Amphibian");
    }

    protected void dispose() {
        System.out.println("dispose Amphibian");
        characteristic.dispose();
        discription.dispose();
        super.dispose();
    }
}
