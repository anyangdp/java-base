package com.thinkInJava.chapter15;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author anyang
 * @CreateTime 2019/4/9
 * @Des
 */
public class GenericVarargs {
    public static <T> List<T> makeList(T... args) {
        List<T> result = new ArrayList<>();
        for (T item : args) {
            result.add(item);
        }
        return result;
    }

    public static void main(String[] args) {
        List<String> ls = makeList("A");
        System.out.println(ls);
        ls = makeList("A", "B", "C");
        System.out.println(ls);
        ls = makeList("ABCDEFGHICKLM".split(""));
        System.out.println(ls);
    }
}
