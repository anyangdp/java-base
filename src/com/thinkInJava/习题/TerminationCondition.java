package com.thinkInJava.习题;

/**
 * @Author anyang
 * @CreateTime 2019/3/25
 * @Des
 */
public class TerminationCondition {
    public static void main(String[] args) {
        Book b = new Book(true);
        b.checkIn();
        System.gc();
//        System.gc();
    }
}
