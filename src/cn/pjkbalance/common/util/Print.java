package cn.pjkbalance.common.util;

import java.io.PrintStream;
import java.util.Collection;

/**
 * Created by jiakang on 2018/5/7.
 */
public class Print {
    public static void print(Object obj) {
        System.out.println(obj);
    }
    public static void print() {
        System.out.println();
    }
    public static void printb(Object obj) {
        System.out.print(obj);
    }
    public static PrintStream printf(String format, Object... objs) {
        return System.out.printf(format, objs);
    }
}
