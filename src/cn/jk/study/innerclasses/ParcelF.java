package cn.jk.study.innerclasses;

import cn.jk.study.util.Print;

/**
 * Created by jiakang on 2018/5/31.
 */
public class ParcelF {
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
        ParcelF p = new ParcelF();
        p.ship("Tasmania");
    }
}
