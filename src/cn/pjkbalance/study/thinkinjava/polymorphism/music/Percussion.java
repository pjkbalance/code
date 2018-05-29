package cn.pjkbalance.study.thinkinjava.polymorphism.music;

import cn.pjkbalance.common.util.Print;

/**
 * Created by jiakang on 2018/5/28.
 */
public class Percussion implements Instrument {
    @Override
    public void play(Note n) {
        Print.print("percussion play " + n);
    }

    @Override
    public String what() {
        return "percussion";
    }

    @Override
    public void adjust() {
        Print.print("adjust percussion");
    }
}
