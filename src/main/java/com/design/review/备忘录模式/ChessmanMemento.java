package com.design.review.备忘录模式;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

/**
 * 角色状态
 * @Author anyang
 * @CreateTime 2019/2/20
 * @Des
 */
@Setter
@Getter
@AllArgsConstructor
public class ChessmanMemento {
    private String label;
    private int x;
    private int y;
}
