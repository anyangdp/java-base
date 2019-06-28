package com.design.facadePattern;

/**
 * @Author anyang
 * @CreateTime 2018/3/20
 * @Des 外观模式
 */
public class FacadePatternDemo {
    public static void main(String[] args) {
        ShapeMaker shapeMaker = new ShapeMaker();

        shapeMaker.drawCircle();
        shapeMaker.drawRectangle();
        shapeMaker.drawSquare();
    }
}
