package cn.jk.study.innerclasses;

import cn.jk.study.util.Print;

/**
 * Created by jiakang on 2018/6/4.
 */
public class ParcelTen {
    public Destination destination(final String dest, final float price) {
        return new Destination() {
            private /*static*/ int cost;
            {
                cost = Math.round(price);
                Print.print(dest);
                Print.print(price);
                if (cost > 100) {
                    Print.print("over budget");
                }
            }
            private String label = dest;
            @Override
            public String readLabel() {
                return dest;
            }
        };
    }
    public static void main (String... args){
        ParcelTen p = new ParcelTen();
        p.destination("abcdefg", 101.11f);
        p.destination("efg", 10.11f);
    }
}
