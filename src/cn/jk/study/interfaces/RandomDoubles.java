package cn.jk.study.interfaces;

import cn.jk.study.util.Print;

import java.util.Random;

/**
 * Created by jiakang on 2018/5/30.
 */
public class RandomDoubles {
    private static Random random = new Random(47);

    public double next() {
        return random.nextDouble();
    }

    public static void main(String... args) {
        RandomDoubles randomDouble = new RandomDoubles();
        for (int i = 0; i < 7; i++) {
            Print.print(randomDouble.next());
        }
    }
}
