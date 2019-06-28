package com.thinkInJava.chapter9.eg9_1;

/**
 * @Author anyang
 * @CreateTime 2019/4/2
 * @Des
 */
public class Brass extends Wind {
    @Override
    public void play(String n) {
        System.out.println("Brass.play()" + n);
    }

    @Override
    public void adjust() {
        super.adjust();
    }
}
