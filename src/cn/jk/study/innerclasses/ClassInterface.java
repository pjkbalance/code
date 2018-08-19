package cn.jk.study.innerclasses;

import cn.jk.study.util.Print;

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
