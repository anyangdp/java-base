package com.thinkInJava.chapter8;

/**
 * @Author anyang
 * @CreateTime 2019/3/28
 * @Des
 */
public class Glyph {
    void draw() {
        System.out.println("Glyph.draw()");
    }

    public Glyph() {
        System.out.println("Before Glyph.draw()");
        draw();
        System.out.println("After Glyph.draw()");
    }
}
