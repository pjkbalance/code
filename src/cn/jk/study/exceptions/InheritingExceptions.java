package cn.jk.study.exceptions;

import cn.jk.study.util.Print;

/**
 * Created by jiakang on 2018/7/16.
 */
class SimpleException extends  Exception {}

public class InheritingExceptions {
    public void f() throws SimpleException {
        Print.print("throw simple exception from f()");
        throw new SimpleException();
    }

    public static void main(String... args) {
        InheritingExceptions sed = new InheritingExceptions();
        try {
            sed.f();
        } catch (SimpleException e) {
            Print.print("catch it");
            e.printStackTrace();
        }
    }

}
