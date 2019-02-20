package com.design.review.备忘录模式;

/**
 * @Author anyang
 * @CreateTime 2019/2/20
 * @Des
 */
public class Client {
    private static int index = -1;
    private static MementoCaretaker mc = new MementoCaretaker();
    //下棋，同时保存备忘录
    public static void play(Chessman chess) {
        mc.addMemento(chess.save());
        index++;
        chess.show();
    }

    //悔棋，撤销到上一个备忘录
    public static void undo(Chessman chess, int i) {
        System.out.println("******悔棋******");
        index--;
        chess.restore(mc.getMemento(i - 1));
        chess.show();
    }

    public static void redo(Chessman chess, int i) {
        System.out.println("*******撤销悔棋******");
        index++;
        chess.restore(mc.getMemento(i + 1));
        chess.show();
    }

    public static void main(String[] args) {
        Chessman chess = new Chessman("车", 1, 1);
        play(chess);
        chess.setY(4);
        play(chess);
        chess.setY(5);
        play(chess);
        undo(chess, index);
        undo(chess, index);
        redo(chess, index);
        redo(chess, index);
    }
}
