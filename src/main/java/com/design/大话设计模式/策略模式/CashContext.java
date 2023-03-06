package com.design.大话设计模式.策略模式;

/**
 * @Author anyang
 * @CreateTime 2023/3/6
 * @Des
 */
public class CashContext {
    private CashSuper cs;

    public CashContext(String type) {
        switch(type) {
            case "正常收费": cs = new CashNormal(); break;
            case "每满300减100": cs = new CashReturn(300, 100); break;
            case "打8折": cs = new CashRebate(0.8); break;
        }
    }

    public double getResult(double money) {
        return cs.acceptCash(money);
    }

    public static void main(String[] args) {
        CashContext cc = new CashContext("打8折");
        double result = cc.getResult(400 * 3);
        System.out.println(result);
        CashContext cc1 = new CashContext("每满300减100");
        double result1 = cc1.getResult(400 * 3);
        System.out.println(result1);
    }
}
