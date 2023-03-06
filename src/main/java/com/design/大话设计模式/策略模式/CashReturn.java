package com.design.大话设计模式.策略模式;

/**
 * @Author anyang
 * @CreateTime 2023/3/6
 * @Des 打折收费
 */
public class CashReturn extends CashSuper {
    private double moneyCondition = 0;
    private double moneyReturn = 0;

    public CashReturn(double moneyCondition, double moneyReturn) {
        this.moneyCondition = moneyCondition;
        this.moneyReturn = moneyReturn;
    }

    @Override
    public double acceptCash(double money) {
        double result = money;
        if (money >= moneyCondition) {
            result = money - Math.floor(money / moneyCondition) * moneyReturn;
        }
        return result;
    }
}
