package com.thinkInJava.chapter17;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

/**
 * @Author anyang
 * @CreateTime 2019/4/10
 * @Des
 */
public class SetDemo {
    public static void main(String[] args) {
        Set<String> hashSet = new HashSet<>();
        Set<Integer> treeSet = new TreeSet<>();
        for (int i = 0; i < 10; i++) {
            hashSet.add(i+"");
            treeSet.add(i);
        }
        Iterator<String> hashSetIterator = hashSet.iterator();
        while (hashSetIterator.hasNext())
            System.out.println(hashSetIterator.next());
        System.out.println("***************");
        Iterator<Integer> treeSetIterator = treeSet.iterator();
        while (treeSetIterator.hasNext())
            System.out.println(treeSetIterator.next());
    }
}
