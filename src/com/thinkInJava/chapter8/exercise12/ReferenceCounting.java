package com.thinkInJava.chapter8.exercise12;

/**
 * @Author anyang
 * @CreateTime 2019/3/28
 * @Des
 */
public class ReferenceCounting {

    public static void main(String[] args) throws Throwable {
        Shared shared = new Shared();
        Composing[] composings = {new Composing(shared), new Composing(shared), new Composing(shared), new Composing(shared), new Composing(shared)};
        for (Composing c : composings) {
            c.dispose();
            c.finalize();
        }
        System.gc();
    }
}
