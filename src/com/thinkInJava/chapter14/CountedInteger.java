package com.thinkInJava.chapter14;

/**
 * @Author anyang
 * @CreateTime 2019/4/8
 * @Des
 */
public class CountedInteger {
    private static long counter;
    private final long id = counter++;

    @Override
    public String toString() {
        return Long.toString(id);
    }
}
