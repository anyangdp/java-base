package com.thinkInJava.exercise1.q2;

/**
 * java命令运行时，不需要任何后缀，并且移除package引用
 */

/**
 * @Author anyang
 * @CreateTime 2019/3/22
 * @Des
 */
public class Helloworld {
    public static void main(String[] args) {
        System.out.println("hello world");
        Integer a = -129;
        Integer b = -129;
        System.out.println(a.hashCode());
        System.out.println(b.hashCode());
    }
}
