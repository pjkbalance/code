package cn.pjkbalance.study.thinkinjava.polymorphism.music;

import cn.pjkbalance.common.util.Print;

/**
 * Created by jiakang on 2018/5/24.
 */
public class Stringed extends Instrument {
    @Override
    public void play(Note n) {
        Print.print("Stringed play "+n);
    }
}
