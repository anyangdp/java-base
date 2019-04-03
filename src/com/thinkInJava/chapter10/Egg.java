package com.thinkInJava.chapter10;

/**
 * @Author anyang
 * @CreateTime 2019/4/3
 * @Des
 */
public class Egg {
    private Yolk y;
    protected class Yolk {
        public Yolk() {
            System.out.println("Egg.Yolk()");
        }
    }

    public Egg() {
        System.out.println("New Egg()");
        y = new Yolk();
    }
}
