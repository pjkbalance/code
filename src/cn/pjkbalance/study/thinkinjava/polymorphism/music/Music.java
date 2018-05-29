package cn.pjkbalance.study.thinkinjava.polymorphism.music;

import cn.pjkbalance.common.util.Print;

/**
 * 使用向上转型
 * Created by jiakang on 2018/5/24.
 */

public class Music {
    public static void tune(Instrument i) {
        i.play(Note.MIDDLE_C);
    }

    public static void main(String... args) {
        Wind flute = new Wind();
        tune(flute);
    }
}
