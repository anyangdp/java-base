package com.thinkInJava.chapter9;

/**
 * @Author anyang
 * @CreateTime 2019/3/29
 * @Des
 */
public interface A {
    interface B {
        void f();
    }
    public class Bimpl implements B {
        @Override
        public void f() {

        }
    }
    class Bimpl2 implements B {
        @Override
        public void f() {

        }
    }


}
