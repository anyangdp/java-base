package com.thinkInJava.exercise18;

/**
 * @Author anyang
 * @CreateTime 2019/3/26
 * @Des
 */
public class BlankFinal {
    private final int i = 0;
    private final int j;
    private final Poppet poppet;

    public BlankFinal() {
        this.j = 1;
        this.poppet = new Poppet(1);
    }

    public BlankFinal(int x) {
        j = x;
        poppet = new Poppet(x);
    }

    public static void main(String[] args) {
        new BlankFinal();
        new BlankFinal(2);
    }
}
