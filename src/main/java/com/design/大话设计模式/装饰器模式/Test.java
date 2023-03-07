package com.design.大话设计模式.装饰器模式;

/**
 * @Author anyang
 * @CreateTime 2023/3/7
 * @Des
 */
public class Test {
    public static void main(String[] args) {
        Person person = new Person("张三");
        TShirts tShirts = new TShirts();
        BigTrouser bigTrouser = new BigTrouser();
        tShirts.decorate(person);
        bigTrouser.decorate(tShirts);
        bigTrouser.show();
    }
}
