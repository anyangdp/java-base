package com.thinkInJava.chapter8.exercise12;

/**
 * @Author anyang
 * @CreateTime 2019/3/28
 * @Des
 */
public class Shared {
    private int refcount = 0;
    private static long counter = 0;
    private final long id = counter++;

    public Shared() {
        System.out.println("Creating" + this);
    }

    public void addRef() {
        refcount++;
    }

    protected void dispose() {
        if (--refcount == 0) {
            System.out.println("Disposing" + this);
        }
    }

    @Override
    public String toString() {
        return "Shared" + id;
    }

    @Override
    protected void finalize() throws Throwable {
        if (--refcount == 0) {
            return;
        } else {
            super.finalize();
        }
    }
    public int getRefcount() {//用于外界获取shared当前的状态
        return refcount;
    }
}
