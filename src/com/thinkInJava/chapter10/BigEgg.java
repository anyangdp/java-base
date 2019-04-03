package com.thinkInJava.chapter10;

/**
 * @Author anyang
 * @CreateTime 2019/4/3
 * @Des
 */
public class BigEgg extends Egg {
    public class Yolk {
        public Yolk() {
            System.out.println("BigEgg.Yolk()");
        }
    }

    public static void main(String[] args) {
        new BigEgg();
    }
}
