package com.thinkInJava;

import com.thinkInJava.exercise15.Villain;

/**
 * @Author anyang
 * @CreateTime 2019/3/25
 * @Des
 */
public class LongToBinaryString {
    public static void main(String[] args) {
        long a = 0x17L;
        long b = 017L;
        System.out.println(Long.toBinaryString(a));
        System.out.println(Long.toBinaryString(b));

        long n3 = 200;
        float f4 = 1e-43f;
        System.out.println(n3);
        System.out.println(f4);
        Villain villain = new Villain("dd");
        System.out.println(villain);
    }
}
