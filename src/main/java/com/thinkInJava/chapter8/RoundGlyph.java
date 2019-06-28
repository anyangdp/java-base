package com.thinkInJava.chapter8;

/**
 * @Author anyang
 * @CreateTime 2019/3/28
 * @Des
 */
public class RoundGlyph extends Glyph {
    private int radiu;

    public RoundGlyph(int radiu) {
        this.radiu = radiu;
        System.out.println("RoundGlyph.RoundGlyph(), radiu =" + radiu);
    }

    @Override
    void draw() {
        System.out.println("RoundGlyph.draw(), radiu="+radiu);
    }

    public static void main(String[] args) {
        new RoundGlyph(5);
    }
}
