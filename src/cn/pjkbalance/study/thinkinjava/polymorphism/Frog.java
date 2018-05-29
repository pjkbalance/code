package cn.pjkbalance.study.thinkinjava.polymorphism;

import cn.pjkbalance.common.util.Print;
import cn.pjkbalance.study.others.thread.Product;
import sun.security.krb5.internal.crypto.Des;

import javax.print.DocFlavor;

/**
 * Created by jiakang on 2018/5/28.
 */
class Characteristic {
    private String s;

    Characteristic(String s) {
        this.s = s;
        Print.print("create characteristic === " + this.s);
    }

    protected void disponse() {
        Print.print("disponse characteristic === " + this.s);
    }
}

class Description {
    private String s;

    Description(String s) {
        this.s = s;
        Print.print("create description === " + this.s);
    }

    protected void disponse() {
        Print.print("disponse description === " + this.s);
    }
}

class LivingCreature {
    private Characteristic c = new Characteristic("is alive");
    private Description d = new Description("basic living creature");

    LivingCreature() {
        Print.print("create LivingCreature");
    }

    protected void dispose() {
        Print.print("dispose LivingCreature");
        c.disponse();
        d.disponse();
    }
}

class Animal extends LivingCreature {
    private Characteristic c = new Characteristic("has heart");
    private Description d = new Description("Animal not Vegetable");

    Animal() {
        Print.print("create Animal");
    }

    @Override
    protected void dispose() {
        Print.print("dispose animal");
        d.disponse();
        c.disponse();
        super.dispose();
    }
}

class Amphibian extends Animal {
    private Characteristic c = new Characteristic("can live in water");
    private Description d = new Description("both water and land");

    Amphibian() {
        Print.print("create Amphibian");
    }

    @Override
    protected void dispose() {
        Print.print("diapose Amphibian");
        d.disponse();
        c.disponse();
        super.dispose();
    }
}

public class Frog extends Amphibian {
    private Characteristic c = new Characteristic("Croaks");
    private Description d = new Description("eat bugs");

    Frog() {
        Print.print("create Frog");
    }

    @Override
    protected void dispose() {
        Print.print("dispose Frog");
        d.disponse();
        c.disponse();
        super.dispose();
    }

    public static void main(String... args) {
        Frog f = new Frog();
        Print.print("bye bye");
        f.dispose();
    }
}
