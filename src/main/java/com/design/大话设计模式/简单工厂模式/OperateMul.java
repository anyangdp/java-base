package com.design.大话设计模式.简单工厂模式;

/**
 * @Author anyang
 * @CreateTime 2023/3/6
 * @Des
 */
public class OperateMul extends Operate{
    @Override
    public double getResult() {
        return getA() * getB();
    }
}
