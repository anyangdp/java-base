package com.thinkInJava.chapter10;

/**
 * @Author anyang
 * @CreateTime 2019/4/3
 * @Des
 */
public class InheritInner2 {
    class InnerInheritInner2 extends WithInner2.Inner2 {
        public InnerInheritInner2(WithInner2 withInner2) {
            withInner2.super();
            System.out.println("InnerInheritInner2");
        }
    }

    public static void main(String[] args) {
        InheritInner2 i = new InheritInner2();
        WithInner2 withInner2 = new WithInner2("fff");
        InnerInheritInner2 b = i.new InnerInheritInner2(withInner2);

    }
}
