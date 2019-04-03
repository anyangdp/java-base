package com.thinkInJava.chapter9.eg9_1;

/**
 * @Author anyang
 * @CreateTime 2019/4/2
 * @Des
 */
public class Percussion extends Instrument {
    @Override
    public String what() {
        return "Percussion";
    }

    @Override
    public void play(String n) {
        System.out.println("Percussion.play()" + n);
    }

    @Override
    public void adjust() {

    }
}
