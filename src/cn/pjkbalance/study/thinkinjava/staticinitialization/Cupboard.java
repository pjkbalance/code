package cn.pjkbalance.study.thinkinjava.staticinitialization;

/**
 * Created by jiakang on 2018/5/7.
 */
public class Cupboard {
    Bowl bowl3 = new Bowl(3);

    static Bowl bowl4 = new Bowl(4);

    Cupboard() {
        System.out.println("Cupboard");
        bowl3.f(3);
        bowl4.f(4);
    }

    void f(int marker) {
        System.out.println("Cupboard.f(" + marker + ")");
    }

    static Bowl bowl5 = new Bowl(5);
}
