package com.thinkInJava.chapter8;

/**
 * 构造器顺序：基类构造器递归->顺序导出类成员初始方法->导出类构造器主体
 * @Author anyang
 * @CreateTime 2019/3/27
 * @Des
 */
public class Sandwich extends PortableLunch {
    private Bread bread = new Bread();
    private Cheese cheese = new Cheese();
    private Lettuce lettuce = new Lettuce();
    private Pickle pickle = new Pickle();

    public Sandwich() {
        System.out.println("sandwich");
    }

    public static void main(String[] args) {
        Sandwich sandwich = new Sandwich();
    }
}
