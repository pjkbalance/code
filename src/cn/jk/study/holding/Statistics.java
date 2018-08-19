package cn.jk.study.holding;

import cn.jk.study.util.Print;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

/**
 * Created by jiakang on 2018/6/20.
 */
public class Statistics {
    public static void main(String... args) {
        Random rand = new Random(47);
        Map<Integer, Integer> m = new HashMap<>();
        for (int i = 0; i < 1000; i++) {
            int r = rand.nextInt(20);
            Integer count = m.get(r);
            m.put(r, count == null ? 0 : ++count);
        }
        Print.print(m);
    }
}
