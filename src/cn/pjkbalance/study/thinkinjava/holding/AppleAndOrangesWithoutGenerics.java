package cn.pjkbalance.study.thinkinjava.holding;

import java.util.ArrayList;

/**
 * Created by jiakang on 2018/6/6.
 */
class Apple {
    private static long counter;
    private final long id = counter++;
    public long id() {return id;}
}

class Orange {}

/**
 * @author jiakang
 */
public class AppleAndOrangesWithoutGenerics {
    public static void main(String... args) {
        ArrayList<Apple> apples = new ArrayList();
        for (int i = 0; i < 3; i++) {
            apples.add(new Apple());
        }
//        apples.add(new Orange());
        for (int i = 0; i < apples.size(); i++) {
//            ((Apple)apples.get(i)).id();
            apples.get(i).id();
        }
    }
}
