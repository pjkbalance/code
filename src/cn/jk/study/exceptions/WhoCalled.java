package cn.jk.study.exceptions;

/**
 * Created by jiakang on 2018/7/17.
 */
public class WhoCalled {
    static void f() {
        try {
            throw new Exception();
        } catch (Exception e) {
            for (StackTraceElement s :
                    e.getStackTrace()) {
                System.out.println(s.getLineNumber());
            }
        }
    }
    static void g() {f();}

    public static void main(String... args) {
        g();
    }
}

