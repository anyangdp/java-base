package com.thinkInJava.chapter8.exercise16;

/**
 * @Author anyang
 * @CreateTime 2019/3/28
 * @Des
 */
public class Stage {
    private Actor actor;

    public Stage(Actor actor) {
        this.actor = actor;
    }

    public void performAct() {
        actor.act();
    }

    public static void main(String[] args) {
        Stage stage = new Stage(new HappyActor());
        stage.performAct();
        stage = new Stage(new SadActor());
        stage.performAct();

    }
}
