package cn.jk.study.interfaces;

/**
 * Created by jiakang on 2018/5/30.
 */
interface I1 {void f();}
interface I2{int f(int i);}
interface I3{int f();}
class C {public int f() {return 1;}}
class C2 implements I1,I2 {
    @Override
    public void f() {
    }
    @Override
    public int f(int i) {
        return i;
    }
}
class C3 extends C implements I2 {
    @Override
    public int f(int i) {
        return 2;
    }
}
class C4 extends C implements I3 {}
public class InterfaceCollision {
}
