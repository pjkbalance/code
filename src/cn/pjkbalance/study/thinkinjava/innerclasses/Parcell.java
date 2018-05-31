package cn.pjkbalance.study.thinkinjava.innerclasses;

import cn.pjkbalance.common.util.Print;

/**
 * Created by jiakang on 2018/5/31.
 */
public class Parcell {
    class Contents {
        private int i = 1;
        public int value() {return i;}
    }

    class Destination {
        private String label;
        Destination(String whereTo) {
            label = whereTo;
        }
        String readLabel() {return label;}
    }

    public void ship(String dest) {
        Contents c = new Contents();
        Destination d = new Destination(dest);
        Print.print(d.readLabel());
    }

    public static void main(String... args){
        Parcell p = new Parcell();
        p.ship("Tasmania");
    }
}
