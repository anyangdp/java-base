package com.thinkInJava.chapter8;

/**
 * @Author anyang
 * @CreateTime 2019/3/27
 * @Des
 */
public class LivingCreature {
    private Characteristic characteristic = new Characteristic("is alive");
    private Discription discription = new Discription("basic Living Creature");

    public LivingCreature() {
        System.out.println("LivingCreature");
    }

    protected void dispose() {
        System.out.println("dispose LivingCreature");
        characteristic.dispose();
        discription.dispose();
    }
}
