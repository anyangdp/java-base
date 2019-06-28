package com.thinkInJava.chapter12;

/**
 * @Author anyang
 * @CreateTime 2019/4/8
 * @Des
 */
public abstract class Inning {
    public Inning() {
    }

    public void event() throws BaseBallException{

    }

    public abstract void atBat() throws Strike, Foul;

    public void walk() {}
}
