package cn.pjkbalance.study.thinkinjava.innerclasses;

import cn.pjkbalance.common.util.Print;

/**
 * Created by jiakang on 2018/6/4.
 */
interface Incrementable {
    void incrementable();
}

class Callee1 implements Incrementable {
    private int i = 0;
    @Override
    public void incrementable() {
        Print.print(++i);
    }
}
class MyIncrement {
    public void increment() {Print.print("other operation");}
    static void f(MyIncrement mi) {mi.increment();}
}

class Callee2 extends MyIncrement {
    private int i = 0;
    @Override
    public void increment() {
        super.increment();
        Print.print(++i);
    }

    private class Closure implements Incrementable {
        @Override
        public void incrementable() {
            Callee2.this.increment();
        }
    }
    Incrementable getCallbackReference() {
        return new Closure();
    }
}
class Caller {
    private Incrementable callbackReference;
    Caller(Incrementable c) {callbackReference = c;}
    void go () {
        callbackReference.incrementable();
    }
}
public class Callback {
    public static void main(String... args){
        Callee1 c1 = new Callee1();
        Callee2 c2 = new Callee2();
        MyIncrement.f(c2);
        Caller caller1 = new Caller(c1);
        Caller caller2 = new Caller(c2.getCallbackReference());
        caller1.go();
        caller1.go();
        Print.print("=====");
        caller2.go();
        caller2.go();
    }
}
