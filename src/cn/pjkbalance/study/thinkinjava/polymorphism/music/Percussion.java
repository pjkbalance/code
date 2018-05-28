package cn.pjkbalance.study.thinkinjava.polymorphism.music;

import cn.pjkbalance.common.util.Print;

/**
 * Created by jiakang on 2018/5/28.
 */
public class Percussion extends Instrument {
    @Override
    void play(Note n) {
        Print.print("percussion play " + n);
    }

    @Override
    String what() {
        return "percussion";
    }

    @Override
    void adjust() {
        Print.print("adjust percussion");
    }
}
