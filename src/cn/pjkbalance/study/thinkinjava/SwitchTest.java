package cn.pjkbalance.study.thinkinjava;

import cn.pjkbalance.common.util.Print;

/**
 * Created by jiakang on 2018/5/28.
 */
public class SwitchTest {
    private static String test(int i) {
        switch (i) {
            default:
            case 0:
                return "0";
            case 1:
                return "1";
            case 2:
                return "2";
        }
    }

    public static void main(String... args) {
        for (int i = 0; i < 5; i++)
            Print.print(i + " ===== " + test(i));
    }
}
