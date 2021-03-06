package cn.jk.study.interfaces.interfaceprocessor;

import cn.jk.study.interfaces.filters.*;
import cn.jk.study.study.thinkinjava.interfaces.filters.*;
import cn.pjkbalance.study.thinkinjava.interfaces.filters.*;

/**
 * Created by jiakang on 2018/5/30.
 */
class FilterAdapter implements Processor {
    Filter filter;

    public FilterAdapter(Filter filter) {
        this.filter = filter;
    }

    @Override
    public String name() {
        return filter.name();
    }

    @Override
    public Waveform process(Object input) {
        return filter.process((Waveform) input);
    }
}

public class FilterProcessor {
    public static void main(String... args) {
        Waveform w = new Waveform();
        Apply.process(new FilterAdapter(new LowPass(1.0)), w);
        Apply.process(new FilterAdapter(new HighPass(2.0)), w);
        Apply.process(new FilterAdapter(new BandPass(3.0, 4.0)), w);
    }
}
