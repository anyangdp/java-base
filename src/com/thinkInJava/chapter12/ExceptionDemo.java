package com.thinkInJava.chapter12;

/**
 * @Author anyang
 * @CreateTime 2019/4/8
 * @Des
 */
public class ExceptionDemo {
    public static void main(String[] args) {
        try {
            double i = 1 / 0;
        } catch (Exception e) {
            try {
                throw new MyException("异常");
            } catch (MyException e1) {
                System.out.println("自定义异常");
            }
        } finally {
            System.out.println("finally");
        }
        System.out.println("结束");
    }
}
