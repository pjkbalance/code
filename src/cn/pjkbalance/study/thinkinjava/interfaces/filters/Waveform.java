package cn.pjkbalance.study.thinkinjava.interfaces.filters;

/**
 * Created by jiakang on 2018/5/30.
 */
public class Waveform {
    private static long counter;
    private final long id = counter++;

    @Override
    public String toString () {return "wave form "+id;}
}