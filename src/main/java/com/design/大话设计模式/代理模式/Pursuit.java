package com.design.大话设计模式.代理模式;

/**
 * @Author anyang
 * @CreateTime 2023/3/8
 * @Des
 */
public class Pursuit implements GiveGift{
    SchoolGirl mm;

    public Pursuit(SchoolGirl mm) {
        this.mm = mm;
    }

    @Override
    public void giveDolls() {
        System.out.println(mm.getName() + "送你洋娃娃");
    }

    @Override
    public void giveFlowers() {
        System.out.println(mm.getName() + "送你花");
    }

    @Override
    public void giveChocolate() {
        System.out.println(mm.getName() + "送你巧克力");
    }
}
