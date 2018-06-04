package cn.pjkbalance.study.thinkinjava.innerclasses;

import cn.pjkbalance.common.util.Print;

/**
 * Created by jiakang on 2018/6/4.
 */
public interface ClassInterface {
    void howdy();
    class Test implements ClassInterface {
        @Override
        public void howdy() {
            Print.print("howdy");
        }

        public static void main(String... args) {
            new Test().howdy();
        }
    }
}
