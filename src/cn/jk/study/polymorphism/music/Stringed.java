package cn.jk.study.polymorphism.music;

import cn.jk.study.util.Print;

/**
 * Created by jiakang on 2018/5/24.
 */
public class Stringed implements Instrument {
    @Override
    public void play(Note n) {
        Print.print("Stringed play " + n);
    }

    @Override
    public String what() {
        return "stringed";
    }

    @Override
    public void adjust() {
        Print.print("adjust stringed");
    }
}
