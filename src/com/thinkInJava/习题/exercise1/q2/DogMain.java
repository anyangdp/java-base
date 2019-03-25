package com.thinkInJava.习题.exercise1.q2;

/**
 * @Author anyang
 * @CreateTime 2019/3/22
 * @Des
 */
public class DogMain {
    public static void main(String[] args) {
        Dog spot = new Dog();
//        spot.says = "ruff";
        Dog scruffy = spot;
//        scruffy.says = "Wurf";
//        System.out.println(spot.says);
//        System.out.println(scruffy.says);
        System.out.println(spot == scruffy);
        System.out.println(spot.equals(scruffy));
    }
}
