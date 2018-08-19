package cn.jk.study.interfaces.interfaceprocessor;

import cn.jk.study.util.Print;

/**
 * Created by jiakang on 2018/5/30.
 */
public class Apply {
    public static void process(Processor p, Object s) {
        Print.print("using "+p.name());
        Print.print(p.process(s));
    }
}
