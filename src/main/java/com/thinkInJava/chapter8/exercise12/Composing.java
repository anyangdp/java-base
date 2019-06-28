package com.thinkInJava.chapter8.exercise12;

/**
 * @Author anyang
 * @CreateTime 2019/3/28
 * @Des
 */
public class Composing {
    private Shared shared;
    private static long counter = 0;
    private final long id = counter++;

    public Composing(Shared shared) {
        System.out.println("Create" + this);
        this.shared = shared;
        this.shared.addRef();
    }
    protected void dispose() {
        System.out.println("Disposing" + this);
        shared.dispose();
    }

    @Override
    public String toString() {
        return "composing" + id;
    }

    @Override
    protected void finalize() throws Throwable {//题目要求添加的方法
        if (shared.getRefcount() != 0){
            System.out.println("can not finalize now");
            return;
        } else {
            System.out.println("finalize now");
            super.finalize();
        }
    }
}
