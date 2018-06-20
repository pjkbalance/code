package cn.pjkbalance.study.thinkinjava.holding;

import cn.pjkbalance.common.util.Print;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

/**
 * Created by jiakang on 2018/6/20.
 */
public class SetOfInteger {
    public static void main(String... args) {
        Random random = new Random(47);
        Set<Integer> intset = new HashSet<>();
        for (int i = 0; i < 1000; i++){
            intset.add(random.nextInt(30));
        }
        Print.print(intset);
    }
}
