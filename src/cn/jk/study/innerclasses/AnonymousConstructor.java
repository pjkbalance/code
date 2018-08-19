package cn.jk.study.innerclasses;

import cn.jk.study.util.Print;

/**
 * Created by jiakang on 2018/6/4.
 */
abstract class Base {
    public Base(int i) {
        Print.print("base i = "+i);
    }
    abstract void f();
}
public class AnonymousConstructor {
    public static Base getBase(int i) {
        return new Base(i) {
            {Print.print("init");}
            @Override
            void f() {
                Print.print("f");
            }
        };
    }

    public static void main(String... args) {
        Base base = getBase(47);
        base.f();
    }
}
