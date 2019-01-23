package com.design.bridgePattern;

/**
 * @Author anyang
 * @CreateTime 2018/3/20
 * @Des
 */
public abstract class Shape {
    protected DrawAPI drawAPI;

    public Shape(DrawAPI drawAPI) {
        this.drawAPI = drawAPI;
    }

    public abstract void draw();
}
