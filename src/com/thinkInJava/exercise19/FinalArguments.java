package com.thinkInJava.exercise19;

/**
 * @Author anyang
 * @CreateTime 2019/3/26
 * @Des
 */
public class FinalArguments {
    void with(final Gizmo g) {
//        g = new Gizmo();
//        g.spin();
    }

    void without(Gizmo g) {
        g = new Gizmo();
        g.spin();
    }

    void f(final int i) {

    }

    public static void main(String[] args) {
        FinalArguments f = new FinalArguments();
        f.with(null);
        f.without(null);
    }
}
