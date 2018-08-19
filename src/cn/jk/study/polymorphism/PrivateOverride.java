package cn.jk.study.polymorphism;

import cn.jk.study.util.Print;

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
