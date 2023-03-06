package com.design.大话设计模式.简单工厂模式;

/**
 * @Author anyang
 * @CreateTime 2023/3/6
 * @Des
 */
public class SimpleOperateFactory {
    public static Operate createOperate(String operate) {
        Operate op = null;
        switch (operate) {
            case "+": op = new OperateAdd(); break;
            case "-": op = new OperateSub(); break;
            case "*": op = new OperateMul(); break;
            case "/": op = new OperateDiv(); break;
        }
        return op;
    }

    public static void main(String[] args) {
        Operate operate = SimpleOperateFactory.createOperate("+");
        operate.setA(1);
        operate.setB(2);
        System.out.println(operate.getResult());
        Operate operate2 = SimpleOperateFactory.createOperate("/");
        operate2.setA(1);
        operate2.setB(0);
        System.out.println(operate2.getResult());

    }
}
