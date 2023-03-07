package com.design.大话设计模式.装饰器模式;

/**
 * @Author anyang
 * @CreateTime 2023/3/7
 * @Des
 */
public class TShirts extends Finery {
    @Override
    public void show() {
        super.show();
        System.out.println("大T恤");
    }
}
