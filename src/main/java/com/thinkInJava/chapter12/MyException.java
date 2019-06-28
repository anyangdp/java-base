package com.thinkInJava.chapter12;

/**
 * @Author anyang
 * @CreateTime 2019/4/8
 * @Des
 */
public class MyException extends RuntimeException {
    public MyException() {
        super();
    }

    public MyException(String message) {
        super(message);
    }
}
