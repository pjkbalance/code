package cn.pjkbalance.study.thinkinjava.polymorphism;

import cn.pjkbalance.common.util.Print;

/**
 * Created by jiakang on 2018/5/29.
 */
class Userful {
    public void f() {
    }

    public void g() {
    }
}

class MoreUserful extends Userful {
    @Override
    public void f() {
    }

    @Override
    public void g() {
    }

    public void u() {
        Print.print("u");
    }

    public void v() {
    }

    public void w() {
    }
}

public class RTTI {
    public static void main(String... args) {
        Userful[] x = {new Userful(), new MoreUserful()};
        x[0].f();
        x[1].f();

        //x[1].u();

        //((MoreUserful) x[0]).u();//Exception in thread "main" java.lang.ClassCastException`
        ((MoreUserful) x[1]).u();
    }

}
