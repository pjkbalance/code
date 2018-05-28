package cn.pjkbalance.study.thinkinjava.polymorphism.music;

import cn.pjkbalance.common.util.Print;

/**
 * Created by jiakang on 2018/5/28.
 */
public class Music3 {
    public static void tune(Instrument i) {
        Print.print("=====" + i.what());
        i.play(Note.MIDDLE_C);
        i.adjust();
        Print.print();
    }

    public static void tuneAll(Instrument[] e) {
        for (Instrument i : e) {
            tune(i);
        }
    }

    public static void main(String... args) {
        Instrument[] e = {new Wind(), new Percussion(), new Stringed(), new Brass(), new Woodwind()};
        tuneAll(e);
    }
}
