package cn.jk.study.interfaces.filters;

/**
 * Created by jiakang on 2018/5/30.
 */
public class LowPass extends Filter {
    double cutoff;

    public LowPass(double cutoff) {
        this.cutoff = cutoff;
    }

    @Override
    public Waveform process(Waveform input) {
        return input;
    }

}
