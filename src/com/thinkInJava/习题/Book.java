package com.thinkInJava.习题;

/**
 * @Author anyang
 * @CreateTime 2019/3/25
 * @Des
 */
public class Book {
    boolean checkOut = false;

    public Book(boolean checkOut) {
        this.checkOut = checkOut;
    }
    void checkIn() {
        checkOut = false;
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("finalize");
        if (checkOut) {
            System.out.println("error: checkout");
        }
    }
}
