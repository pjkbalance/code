package cn.jk.study.polymorphism.music;

import cn.jk.study.util.Print;

/**
 * Created by jiakang on 2018/5/29.
 */

public class Music4 {
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

        //Instrument test = new Instrument();
    }
}
