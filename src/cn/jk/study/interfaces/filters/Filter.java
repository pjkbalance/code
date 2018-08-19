package cn.jk.study.interfaces.filters;

/**
 * Created by jiakang on 2018/5/30.
 */
public class Filter {
    public String name() {
        return getClass().getSimpleName();
    }

    public Waveform process(Waveform input) {
        return input;
    }
}
