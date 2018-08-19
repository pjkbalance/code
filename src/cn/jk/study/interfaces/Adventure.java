package cn.jk.study.interfaces;

import cn.jk.study.util.Print;

/**
 * Created by jiakang on 2018/5/30.
 */
interface CanFight {
    void fight();
}
interface CanSwim {
    void swim();
    void fly();
}
interface CanFly {
    void fly();
}
class ActionCharacter {
    public void fight() {}
}
class Hero extends  ActionCharacter implements CanFight,CanSwim,CanFly{
    @Override
    public void swim() {

    }
    @Override
    public void fly() {
        Print.print(getClass().getSimpleName()+" fly");
    }
}
public class Adventure {
    public static void t(CanFight x) {x.fight();}
    public static void u(CanSwim x) {x.swim();x.fly();}
    public static void v(CanFly x) {x.fly();}
    public static void w(ActionCharacter x) {x.fight();}
    public static void main(String... args) {
        Hero h = new Hero();
        t(h);
        u(h);
        v(h);
        w(h);
    }
}
