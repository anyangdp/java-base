package com.thinkInJava.exercise22;

/**
 * @Author anyang
 * @CreateTime 2019/3/26
 * @Des
 */
public class Insect {
    private int i = 9;
    protected int j;

    public Insect() {
        System.out.println("i:"+i + ",j:"+j);
        j = 39;
    }

    private static int x1 = printInit("static Insect x1 init");

    static int printInit(String s) {
        System.out.println(s);
        return 47;
    }
}
