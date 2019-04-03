package com.thinkInJava.chapter9.eg9_1;

/**
 * @Author anyang
 * @CreateTime 2019/4/2
 * @Des
 */
public class Wind extends Instrument {
    @Override
    public void play(String n) {
        System.out.println("Wind.play" + n);
    }

    @Override
    public String what() {
        return "Wind";
    }

    @Override
    public void adjust() {
    }
}
