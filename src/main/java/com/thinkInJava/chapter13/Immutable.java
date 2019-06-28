package com.thinkInJava.chapter13;

/**
 * @Author anyang
 * @CreateTime 2019/4/8
 * @Des
 */
public class Immutable {
    public static String upcase(String s) {
        return s.toUpperCase();
    }

    public static void main(String[] args) {
        String q = "howdy";
        String qq = upcase(q);
        System.out.println(q);
        System.out.println(qq);
    }
}
