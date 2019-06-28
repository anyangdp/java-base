package com.thinkInJava.chapter8;

/**
 * @Author anyang
 * @CreateTime 2019/3/27
 * @Des
 */
public class Animal extends LivingCreature {
    private Characteristic characteristic = new Characteristic("has heart");
    private Discription discription = new Discription("Animal not vegetable");

    public Animal() {
        System.out.println("Animal");
    }

    protected void dispose() {
        System.out.println("dispose Animal");
        characteristic.dispose();
        discription.dispose();
        super.dispose();
    }

}
