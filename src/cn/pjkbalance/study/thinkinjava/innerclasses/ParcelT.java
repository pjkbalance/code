package cn.pjkbalance.study.thinkinjava.innerclasses;

/**
 * Created by jiakang on 2018/6/4.
 */
public class ParcelT {
    class Contents {
        private int i = 1;
        public int value() {
            return i;
        }
    }
    class Destination {
        private String label;
        Destination(String whereTo) {
            label = whereTo;
        }
        String readLabel() {return label;}
    }
    public static void main(String... args) {
        ParcelT p = new ParcelT();
        ParcelT.Contents c = p.new Contents();
    }
}
