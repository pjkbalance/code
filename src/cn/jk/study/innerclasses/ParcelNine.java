package cn.jk.study.innerclasses;

/**
 * Created by jiakang on 2018/6/4.
 */
public class ParcelNine {
    public Destination destination(final String desc) {
        return new Destination() {
            private String label = desc;
            @Override
            public String readLabel() {
                return label;
            }
        };
    }

 }
