package cn.pjkbalance.study.thinkinjava.interfaces.interfaceprocessor;

/**
 * Created by jiakang on 2018/5/30.
 */
public interface Processor {
    String name();
    Object process(Object input);
}
