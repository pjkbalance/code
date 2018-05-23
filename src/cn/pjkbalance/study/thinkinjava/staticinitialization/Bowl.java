package cn.pjkbalance.study.thinkinjava.staticinitialization;

/**
 * Created by jiakang on 2018/5/7.
 */
public class Bowl {
    Bowl(int marker) {
        System.out.println("Bowl("+ marker +")");
    }

    void f(int marker) {
        System.out.println("Bowl.f(" + marker + ")");
    }
}
