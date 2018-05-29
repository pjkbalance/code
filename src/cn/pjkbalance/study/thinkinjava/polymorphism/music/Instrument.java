package cn.pjkbalance.study.thinkinjava.polymorphism.music;

import cn.pjkbalance.common.util.Print;

/**
 * Created by jiakang on 2018/5/24.
 */
/*public abstract class Instrument {
    void play(Note n) {
        Print.print(new StringBuilder().append("instrument play ").append(n).toString());
    }

    String what() {
        return "Instrument";
    }

    void adjust() {
        Print.print("adjust instrument");
    }
}*/

public interface Instrument {
    void play(Note n);
    String what();
    void adjust();
   // String a();
}
