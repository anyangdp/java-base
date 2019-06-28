package com.thinkInJava.chapter9.eg9_1.exercise3;

/**
 * @Author anyang
 * @CreateTime 2019/4/2
 * @Des
 */
public class StringPrint extends AbstractBase {
    private int i = 0;
    @Override
    public void print() {
        System.out.println("String print" + i);
    }

    public static void main(String[] args) {
        StringPrint sp = new StringPrint();
//        sp.print();
    }
}
