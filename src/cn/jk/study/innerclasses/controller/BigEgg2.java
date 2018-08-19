package cn.jk.study.innerclasses.controller;

import cn.jk.study.util.Print;

/**
 * Created by jiakang on 2018/6/5.
 */
class Egg2 {
    protected class Yolk {
        public Yolk() {
            Print.print("egg2 yolk");
        }

        public void f() {
            Print.print("egg2 yolk f");
        }
    }

    private Yolk y = new Yolk();

    public Egg2() {
        Print.print("new egg2");
    }

    public void insertYolk(Yolk yy) {
        y = yy;
    }

    public void g() {
        y.f();
    }
}

public class BigEgg2 extends Egg2 {
    public class Yolk extends Egg2.Yolk {
        public Yolk() {
            Print.print("big egg2 yolk");
        }
        @Override
        public void f() {
            Print.print("big egg2 yolk f");
        }
    }

    public BigEgg2() {
        insertYolk(new Yolk());
    }

    public static void main(String... args) {
        Egg2 e2 = new BigEgg2();
        Print.print("============");
        e2.g();
    }

}
