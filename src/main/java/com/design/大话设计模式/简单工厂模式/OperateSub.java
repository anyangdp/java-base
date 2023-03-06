package com.design.大话设计模式.简单工厂模式;

/**
 * @Author anyang
 * @CreateTime 2023/3/6
 * @Des
 */
public class OperateSub extends Operate{
    @Override
    public double getResult() {
        return getA() - getB();
    }
}
