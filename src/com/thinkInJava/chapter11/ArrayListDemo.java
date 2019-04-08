package com.thinkInJava.chapter11;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/**
 * @Author anyang
 * @CreateTime 2019/4/4
 * @Des
 */
public class ArrayListDemo {
    public static void main(String[] args) {
        List<Pet> pets = new ArrayList<>();
        pets.add(new Pet("001", 1));
        pets.add(new Pet("002", 1));
        pets.add(new Pet("003", 1));
        pets.add(new Pet("004", 1));
        List<Pet> pets2 = new ArrayList<>();
        pets2.add(new Pet("001", 1));
        pets2.add(new Pet("002", 1));
        pets2.add(new Pet("003", 1));
        List<Pet> pets3 = new ArrayList<>();
        pets3.add(new Pet("001", 1));
        pets3.add(new Pet("002", 1));
//        System.out.println(pets.toString());
//        pets.retainAll(pets2);
//        System.out.println(pets.toString());
//        pets.retainAll(pets3);
//        System.out.println(pets.toString());
//        pets.addAll(pets3);
//        System.out.println(pets.toString());
//        pets.clear();
//        System.out.println(pets.toString());
//        System.out.println(pets.subList(0, 1).toString());
        ListIterator<Pet> iterator = pets.listIterator();
//        while (iterator.hasNext()) {
//            System.out.println(iterator.next());
//            iterator.remove();
//        }
//        System.out.println(pets.toString());
    }
}
