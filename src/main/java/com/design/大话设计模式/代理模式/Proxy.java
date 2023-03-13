package com.design.大话设计模式.代理模式;

/**
 * @Author anyang
 * @CreateTime 2023/3/8
 * @Des
 */
public class Proxy implements GiveGift{
    Pursuit gg;

    public Proxy(SchoolGirl mm) {
        this.gg = new Pursuit(mm);
    }

    @Override
    public void giveDolls() {
        gg.giveDolls();
    }

    @Override
    public void giveFlowers() {
        gg.giveFlowers();
    }

    @Override
    public void giveChocolate() {
        gg.giveChocolate();
    }

    public static void main(String[] args) {
        SchoolGirl schoolGirl = new SchoolGirl("李娇娇");
        Proxy proxy = new Proxy(schoolGirl);
        proxy.giveDolls();
        proxy.giveFlowers();
        proxy.giveChocolate();
    }
}
