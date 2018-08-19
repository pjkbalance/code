package cn.jk.study.enumtest;

/**
 * Created by jiakang on 2018/5/7.
 */
public class EnumUse {
    public static void main(String... args) {
        EnumTest a = EnumTest.NOT;
        System.out.println(a);

        System.out.println("for each enum");

        for (EnumTest b :
                EnumTest.values()) {
            System.out.println(b.ordinal() + " === " + b);
        }
    }
}
