package cn.pjkbalance.study.thinkinjava.innerclasses;

import cn.pjkbalance.common.util.Print;

/**
 * Created by jiakang on 2018/6/4.
 */
public class DotThis {
    private static int id = 0;

    public DotThis(int id) { this.id = id; }

    void f() {
        Print.print("DotThis.f");
    }

    public class Inner {
        public DotThis outer() {
            return DotThis.this;
        }
    }

    public Inner inner() { return new Inner(); }

    public static void main(String... args) {
        DotThis dt = new DotThis(1);
        DotThis.Inner dti = dt.inner();
        dti.outer().f();
    }
}
