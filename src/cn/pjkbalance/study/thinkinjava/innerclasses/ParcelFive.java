package cn.pjkbalance.study.thinkinjava.innerclasses;

/**
 * Created by jiakang on 2018/6/4.
 */
public class ParcelFive {
    public Destination destination(String s) {
        class PDestination implements Destination {
            private String label;
            private PDestination(String s) {
                this.label = s;
            }

            @Override
            public String readLabel() {
                return label;
            }
        }
        return new PDestination(s);
    }

    public static void main(String... args) {
        ParcelFive p = new ParcelFive();
        Destination d = p.destination("s");
    }
}
