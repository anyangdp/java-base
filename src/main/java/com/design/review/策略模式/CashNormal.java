package com.design.review.策略模式;

/**
 * @Author anyang
 * @CreateTime 2019/2/19
 * @Des
 */
public class CashNormal extends CashSuper {
    @Override
    public double acceptCash() {
        return 0;
    }
}
