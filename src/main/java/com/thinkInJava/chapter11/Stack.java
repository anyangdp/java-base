package com.thinkInJava.chapter11;

import java.util.LinkedList;

/**
 * @Author anyang
 * @CreateTime 2019/4/4
 * @Des
 */
public class Stack<T> {
    private LinkedList<T> storage = new LinkedList<>();
    public void push(T v) {
        storage.addFirst(v);
    }

    public T peek() {
        return storage.getFirst();
    }

    public T pop() {
        return storage.removeFirst();
    }

    public boolean empty() {
        return storage.isEmpty();
    }

    @Override
    public String toString() {
        return storage.toString();
    }

    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        for (String s : "My Dog has fleas".split(" ")) {
            stack.push(s);
        }
        while (!stack.empty()) {
            System.out.println(stack.pop() + " ");
        }

        java.util.Stack<String> stack2 = new java.util.Stack<>();
        for (String s : "My dog has fleas".split(" ")) {
            stack2.push(s);
        }
        while (!stack2.empty()) {
            System.out.println(stack2.pop() + " ");
        }
    }
}
