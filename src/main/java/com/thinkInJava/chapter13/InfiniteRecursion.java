package com.thinkInJava.chapter13;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author anyang
 * @CreateTime 2019/4/8
 * @Des
 */
public class InfiniteRecursion {
    @Override
    public String toString() {
        return "InfiniteRecursion address: " + super.toString() + "\n";
    }

    public static void main(String[] args) {
        List<InfiniteRecursion> v= new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            v.add(new InfiniteRecursion());
        }
        System.out.println(v);
        System.out.printf("%d %f %s", 1, 2.1, "fdfs");
    }
}
