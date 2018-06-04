package cn.pjkbalance.study.thinkinjava.innerclasses;

/**
 * Created by jiakang on 2018/6/4.
 */
class ParcelFour {
    private class PContents implements Contents {
        private int i = 11;
        @Override
        public int value() {
            return i;
        }
    }

    protected class PDestination implements Destination {
        private String label;
        private PDestination(String whereTo) {this.label = whereTo;}
        @Override
        public String readLabel() {
            return label;
        }
    }

    public Destination destination(String s) {
        return new PDestination(s);
    }

    public Contents contents() {
        return new PContents();
    }
}
public class TestParcel {
    public static void main(String... args){
        ParcelFour p = new ParcelFour();
        Contents c = p.contents();
        Destination d = p.destination("test");
        //ParcelFour.PDestination pd = p.new PDestination("aa");
    }
}
