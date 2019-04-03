package com.thinkInJava.chapter9.eg9_1;

/**
 * @Author anyang
 * @CreateTime 2019/4/2
 * @Des
 */
public class Woodwind extends Wind {
    @Override
    public void play(String n) {
        System.out.println("Woodwind.play()"+n);
    }

    @Override
    public String what() {
        return "Woodwind";
    }
}
