package cn.pjkbalance.study.thinkinjava.innerclasses;

import cn.pjkbalance.common.util.Print;
import sun.security.krb5.internal.crypto.Des;

/**
 * Created by jiakang on 2018/5/31.
 */
public class ParcelS {
    class Contents {private int i = 1; public int value() {return i;}}

    class Destination {private String label; Destination(String whereTo) {this.label = whereTo;} String readLabel() {return label;}}

    public Contents contents() {return new Contents();}

    public Destination to(String s) {return new Destination(s);}

    public void ship (String desc) {
        Contents c = new Contents();
        Destination d = new Destination(desc);
        Print.print(d.readLabel());
    }

    public static void main(String... args) {
        ParcelS p = new ParcelS();
        p.ship("abc");
        ParcelS q = new ParcelS();
        ParcelS.Contents c = q.contents();
        ParcelS.Destination d = q.to("haha");
    }
}
