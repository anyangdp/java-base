package com.thinkInJava.chapter9.eg9_1;

/**
 * @Author anyang
 * @CreateTime 2019/4/2
 * @Des
 */
public class Stringed extends Instrument {
    @Override
    public void play(String n) {
        System.out.println("Stringed.play()"+n);
    }

    @Override
    public String what() {
        return "Stringed";
    }

    @Override
    public void adjust() {

    }
}
