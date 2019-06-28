package com.design.review.备忘录模式;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author anyang
 * @CreateTime 2019/2/20
 * @Des
 */
@Data
@AllArgsConstructor
public class Chessman {

    private String label;
    private int x;
    private int y;

    /**
     * 保存位置
     * @return
     */
    public ChessmanMemento save() {
        return new ChessmanMemento(this.label, this.x, this.y);
    }

    /**
     * 恢复位置
     * @param memento
     */
    public void restore(ChessmanMemento memento) {
        this.label = memento.getLabel();
        this.x = memento.getX();
        this.y = memento.getY();
    }

    public void show() {
        System.out.println(String.format("棋子<%s>：当前位置为：<%d, %d>", this.getLabel(), this.getX(), this.getY()));
    }
}
