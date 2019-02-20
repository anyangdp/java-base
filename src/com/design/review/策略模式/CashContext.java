package com.design.review.策略模式;

/**
 * @Author anyang
 * @CreateTime 2019/2/19
 * @Des
 */
public class CashContext {
    CashSuper cs = null;
    public CashContext(String type) {
        switch (type) {
            case "正常收费":
                cs = new CashNormal();
        }
    }

    public double getResult(double money) {
        return cs.acceptCash();
    }

    public static void main(String[] args) {
        CashContext cc = new CashContext("");
        cc.getResult(1234);
    }
}
