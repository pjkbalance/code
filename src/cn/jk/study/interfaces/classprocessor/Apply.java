package cn.jk.study.interfaces.classprocessor;

import cn.jk.study.util.Print;

import java.util.Arrays;

/**
 * Created by jiakang on 2018/5/30.
 */
class Processor {
    public String name() {
        return getClass().getSimpleName();
    }
    Object process(Object input) {return input;}
}
class Upcase extends Processor {
    @Override
    String process(Object input) {
        return ((String)input).toUpperCase();
    }
}
class Downcase extends Processor {
    @Override
    String process(Object input) {
        return ((String)input).toLowerCase();
    }
}
class Splitter extends Processor {
    @Override
    String process(Object input) {
        return Arrays.toString(((String) input).split(" "));
    }
}
public class Apply {
    public static void process(Processor p, Object s) {
        Print.print("using "+p.name());
        Print.print(p.process(s));
    }

    private static String s = "Jiakang.Peng is a good man";

    public static void main(String... args) {
        process(new Upcase(), s);
        process(new Downcase(), s);
        process(new Splitter(), s);
    }
}
