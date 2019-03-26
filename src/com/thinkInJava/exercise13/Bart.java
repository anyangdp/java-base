package com.thinkInJava.exercise13;

/**
 * @Author anyang
 * @CreateTime 2019/3/26
 * @Des
 */
public class Bart extends Homer {
    public int doh(int r) {
        System.out.println("int: " + r);
        return r;
    }

    public static void main(String[] args) {
        Bart b = new Bart();
        b.doh(3.0D);
        b.doh('a');
        b.doh(2.0F);
        b.doh(1);
    }
}
