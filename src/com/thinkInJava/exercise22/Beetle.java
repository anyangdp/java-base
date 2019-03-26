package com.thinkInJava.exercise22;

/**
 *
 * @Author anyang
 * @CreateTime 2019/3/26
 * @Des
 */
public class Beetle extends Insect {
    private int k = printInit("Bettle k init");

    public Beetle() {
        System.out.println("k:"+k);
        System.out.println("j:"+j);
    }

    private static int x2 = printInit("static Bettle x2 init");

    public static void main(String[] args) {
        System.out.println("Beetle constructor");
        Beetle b = new Beetle();
    }
}
