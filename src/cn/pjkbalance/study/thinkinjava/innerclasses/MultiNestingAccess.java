package cn.pjkbalance.study.thinkinjava.innerclasses;

/**
 * Created by jiakang on 2018/6/4.
 */
class MNA {
    private void f() {}

    class A {
        private void g() {}

        class B {
            void h() {
                f();
                g();
//                B.this.h();
//                A.this.g();;
//                MNA.this.f();
            }
        }
    }
}
public class MultiNestingAccess {
    public static void main(String... args)  {
        MNA mna = new MNA();
        MNA.A a = mna.new A();
        MNA.A.B b = a.new B();
    }
}
