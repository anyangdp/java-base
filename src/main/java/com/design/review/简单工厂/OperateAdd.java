package com.design.review.简单工厂;

/**
 * 加法
 * @Author anyang
 * @CreateTime 2019/2/19
 * @Des
 */
public class OperateAdd extends Operation {
    @Override
    public double getResult() {
        return super.inputNumber + super.inputNumber2;
    }
}
