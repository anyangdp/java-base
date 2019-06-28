package com.thinkInJava.chapter8;

/**
 * @Author anyang
 * @CreateTime 2019/3/27
 * @Des
 */
public class Sub extends Super {
    public int field = 1;

    @Override
    public int getField() {
        return field;
    }

    public int getSuperField() {
        return super.field;
    }

    public static void main(String[] args) {
        Super sup = new Sub();
        System.out.println("sup.field:"+ sup.field + ",sup.getField:"+ sup.getField() + ",sup.getSuperField:"+ ((Sub) sup).getSuperField());
        Sub sub = new Sub();
        System.out.println("sub.field:"+ sub.field + ",sub.getField:"+ sub.getField() + ",sub.getSuperField:"+ sub.getSuperField());
    }
}
