package cn.pjkbalance.study.thinkinjava.polymorphism.music;

import cn.pjkbalance.common.util.Print;

/**
 * Created by jiakang on 2018/5/24.
 */
public class Wind implements Instrument {
    @Override
    public void play(Note n) {
        Print.print("wind play " + n);
    }

    @Override
    public String what() {
        return "Wind";
    }

    @Override
    public void adjust() {
        Print.print("adjust wind");
    }
}
