package cn.pjkbalance.study.thinkinjava.polymorphism.music;

/**
 * 未使用向上转型
 * Created by jiakang on 2018/5/24.
 */
public class Music2 {
    public static void tune(Wind i) {
        i.play(Note.MIDDLE_C);
    }

    public static void tune(Stringed i) {
        i.play(Note.MIDDLE_C);
    }

    public static void tune(Brass i) {
        i.play(Note.MIDDLE_C);
    }

    public static void main(String... args) {
        tune(new Wind());
        tune(new Stringed());
        tune(new Brass());
    }
}
