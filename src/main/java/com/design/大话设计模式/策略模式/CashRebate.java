package com.design.大话设计模式.策略模式;

/**
 * @Author anyang
 * @CreateTime 2023/3/6
 * @Des 打折收费
 */
public class CashRebate extends CashSuper {
    private double moneyRebate = 1d;

    public CashRebate(double moneyRebate) {
        this.moneyRebate = moneyRebate;
    }

    @Override
    public double acceptCash(double money) {
        return money * this.moneyRebate;
    }
}
