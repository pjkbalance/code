package cn.pjkbalance.study.thinkinjava.innerclasses;

import cn.pjkbalance.common.util.Print;

/**
 * Created by jiakang on 2018/6/5.
 */
class WithInner {
    class Inner {

    }
    void f() {

        Print.print("F");
    };
}
public class InheritInner extends WithInner.Inner {
    InheritInner(WithInner wi) {
        wi.super();
    }
    public static void main(String... args) {
        WithInner wi = new WithInner();
        InheritInner ii = new InheritInner(wi);
        wi.f();
    }
}
