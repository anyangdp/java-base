package com.thinkInJava.chapter8;

/**
 * @Author anyang
 * @CreateTime 2019/3/27
 * @Des
 */
public class Frog extends Amphibian {
    private Characteristic characteristic = new Characteristic("Croaks");
    private Discription discription = new Discription("eat bugs");

    public Frog() {
        System.out.println("Frog");
    }

    protected void dispose() {
        System.out.println("dispose Frog");
        characteristic.dispose();
        discription.dispose();
        super.dispose();
    }

    public static void main(String[] args) {
        Frog frog = new Frog();
        System.out.println("frog bye");
        frog.dispose();
    }
}
