package com.thinkInJava.exercise16;

/**
 * 向上转型
 * @Author anyang
 * @CreateTime 2019/3/26
 * @Des
 */
public class Frog extends Amphibian {

    @Override
    public void jump() {
        System.out.println("child jump");
    }

    public static void main(String[] args) {
        Frog frog = new Frog();
        Amphibian.toJump(frog);
        Amphibian.toJump(new Amphibian());
    }
}

