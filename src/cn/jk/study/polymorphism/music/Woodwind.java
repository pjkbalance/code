package cn.jk.study.polymorphism.music;

import cn.jk.study.util.Print;

/**
 * Created by jiakang on 2018/5/28.
 */
public class Woodwind extends Wind {
    @Override
    public void play(Note n) {
        Print.print("woodwind play " + n);
    }

    @Override
    public String what() {
        return "woodwind";
    }
}
