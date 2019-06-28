package com.design.review.简单工厂;

/**
 * @Author anyang
 * @CreateTime 2019/2/19
 * @Des
 */
public class OperationFactory {
    public static Operation getOperation(String operate) {
        switch (operate) {
            case "+": return new OperateAdd();
        }
        return null;
    }

    public static void main(String[] args) {
        Operation op = OperationFactory.getOperation("+");
        op.inputNumber = 1;
        op.inputNumber2 = 2;
        System.out.println(op.getResult());
    }
}
