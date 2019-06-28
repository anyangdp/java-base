package com.thinkInJava.chapter9.eg9_1;

/**
 * @Author anyang
 * @CreateTime 2019/4/2
 * @Des
 */
public abstract class Instrument {
    private int i;
    public abstract void play(String n);
    public String what() {
        return "Instrument";
    }
    public abstract void adjust();
}
