package com.design.大话设计模式.简单工厂模式;

/**
 * @Author anyang
 * @CreateTime 2023/3/6
 * @Des
 */
public class OperateDiv extends Operate{
    @Override
    public double getResult() {
        if (getB() == 0) {
            throw new RuntimeException("除数不能为空");
        }
        return getA() / getB();
    }
}
