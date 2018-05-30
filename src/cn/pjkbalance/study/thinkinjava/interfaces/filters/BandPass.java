package cn.pjkbalance.study.thinkinjava.interfaces.filters;

/**
 * Created by jiakang on 2018/5/30.
 */
public class BandPass extends Filter {
    double lowCutoff, highCutoff;
    public BandPass(double lowCutoff, double highCutoff) {
        lowCutoff = lowCutoff;
        highCutoff = highCutoff;
    }
    public Waveform process(Waveform input) {return input;}
}
