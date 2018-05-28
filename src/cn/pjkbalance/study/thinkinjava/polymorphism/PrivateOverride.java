package cn.pjkbalance.study.thinkinjava.polymorphism;

import cn.pjkbalance.common.util.Print;

import javax.print.attribute.standard.PrinterMessageFromOperator;

/**
 * Created by jiakang on 2018/5/28.
 */
public class PrivateOverride {
    private void f() {
        Print.print("private f");
    }

    public static void main(String... args) {
        PrivateOverride po = new Derived();
        po.f();
    }
}

class Derived extends PrivateOverride {
    public void f() {
        Print.print("public f");
    }
}
