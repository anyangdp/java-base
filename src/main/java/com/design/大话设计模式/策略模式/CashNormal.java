package com.design.大话设计模式.策略模式;

/**
 * @Author anyang
 * @CreateTime 2023/3/6
 * @Des 正常收费
 */
public class CashNormal extends CashSuper {
    @Override
    public double acceptCash(double money) {
        return money;
    }
}
