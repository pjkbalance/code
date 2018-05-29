package cn.pjkbalance.study.thinkinjava.polymorphism;

import cn.pjkbalance.common.util.Print;

/**
 * Created by jiakang on 2018/5/29.
 */
class Actor {
    public void act() {
    }
}

class HappyActor extends Actor {
    @Override
    public void act() {
        Print.print("happy actor");
    }
}

class SadActor extends Actor {
    @Override
    public void act() {
        Print.print("sad actor");
    }
}

class Stage {
    private Actor actor = new HappyActor();

    public void change() {
        actor = new SadActor();
    }

    public void performPlay() {
        actor.act();
    }
}

public class Transmogrify {
    public static void main(String... args) {
        Stage stage = new Stage();
        stage.performPlay();
        stage.change();
        stage.performPlay();
    }
}
