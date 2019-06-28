package com.thinkInJava.chapter10;

/**
 * @Author anyang
 * @CreateTime 2019/4/3
 * @Des
 */
public class InheritInner extends WithInner.Inner {
    public InheritInner(WithInner wi) {
        wi.super();
    }

    public static void main(String[] args) {
        WithInner withInner = new WithInner();
        InheritInner ii = new InheritInner(withInner);
    }
}
