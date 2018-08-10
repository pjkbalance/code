package cn.pjkbalance.study.thinkinjava;

/**
 * Created by jiakang on 2018/8/10.
 */
public class Test {
    public static void main(String... args) {
        int i = 0;
        for (String str : args) {
            System.out.println((++i)+"="+str);
        }
    }
}
