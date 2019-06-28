package com.thinkInJava.exercise16;

/**
 * @Author anyang
 * @CreateTime 2019/3/26
 * @Des
 */
public class Amphibian {
    public void jump() {
        System.out.println("jump");
    }

    public static void toJump(Amphibian amphibian) {
       amphibian.jump();
    }
}
