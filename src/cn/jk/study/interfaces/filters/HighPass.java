package cn.jk.study.interfaces.filters;

/**
 * Created by jiakang on 2018/5/30.
 */
public class HighPass extends Filter {
    double cutoff;

    public HighPass(double cutoff) {
        this.cutoff = cutoff;
    }

    @Override
    public Waveform process(Waveform input) {
        return input;
    }

}
