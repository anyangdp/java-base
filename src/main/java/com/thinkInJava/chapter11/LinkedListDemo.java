package com.thinkInJava.chapter11;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @Author anyang
 * @CreateTime 2019/4/4
 * @Des
 */
public class LinkedListDemo {
    public static void main(String[] args) {
        List<Pet> pets = new ArrayList<>();
        pets.add(new Pet("001", 1));
        pets.add(new Pet("002", 2));
        pets.add(new Pet("003", 3));
        pets.add(new Pet("004", 4));
        LinkedList<Pet> petLinkedList = new LinkedList<>(pets);
        System.out.println(petLinkedList.toString());
        System.out.println("getFirst()"+petLinkedList.getFirst());
        System.out.println("getLast()"+petLinkedList.getLast());
        System.out.println("peek()"+petLinkedList.peek());
        System.out.println("remove()"+petLinkedList.remove());
        petLinkedList.offer(new Pet("005", 5));
        System.out.println("after offer:"+petLinkedList.toString());
    }
}
