package com.design.大话设计模式.简单工厂模式;

import lombok.Getter;
import lombok.Setter;

/**
 * @Author anyang
 * @CreateTime 2023/3/6
 * @Des
 */
@Setter
@Getter
public abstract class Operate {
    private double a;
    private double b;
    public abstract double getResult();
}
