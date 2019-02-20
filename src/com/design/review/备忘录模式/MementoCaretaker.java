package com.design.review.备忘录模式;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author anyang
 * @CreateTime 2019/2/20
 * @Des
 */
public class MementoCaretaker {
    public List<ChessmanMemento>  mementoList = new ArrayList<>();

    public ChessmanMemento getMemento(int i) {
        return mementoList.get(i);
    }

    public void addMemento(ChessmanMemento memento) {
        mementoList.add(memento);
    }
}
