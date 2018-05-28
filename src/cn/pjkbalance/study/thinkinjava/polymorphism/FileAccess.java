package cn.pjkbalance.study.thinkinjava.polymorphism;

import cn.pjkbalance.common.util.Print;

/**
 * Created by jiakang on 2018/5/28.
 */
class Super {
    public int filed = 0;

    public int getFiled() {
        return filed;
    }
}

class Sub extends Super {
    public int filed = 1;

    @Override
    public int getFiled() {
        return filed;
    }

    public int getSuperFiled() {
        return super.filed;
    }
}

public class FileAccess {
    public static void main(String... args) {
        Super sup = new Sub();
        Print.print("sup.filed===" + sup.filed+"===sup.getFiled==="+sup.getFiled());
        Sub sub = new Sub();
        Print.print("sub.filed==="+sub.filed+"===sub.getFiled==="+sub.getFiled()+"===sub.getSuperFiled==="+sub.getSuperFiled());
    }
}
