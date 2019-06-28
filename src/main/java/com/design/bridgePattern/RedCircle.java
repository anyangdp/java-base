package com.design.bridgePattern;

/**
 * @Author anyang
 * @CreateTime 2018/3/20
 * @Des
 */
public class RedCircle implements DrawAPI {
    @Override
    public void drawCircle(int radius, int x, int y) {
        System.out.println("Drawing Circle[ color: red, radius: "
                + radius +", x: " +x+", "+ y +"]");
    }
}
