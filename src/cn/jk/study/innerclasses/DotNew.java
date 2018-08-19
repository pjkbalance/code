package cn.jk.study.innerclasses;

import cn.jk.study.util.Print;

/**
 * Created by jiakang on 2018/6/4.
 */
public class DotNew {
    public class Inner{
        public Inner() {
            Print.print("inner");
        }
    }
    public class InnerS {
        public InnerS(){Print.print("inner second");}
    }
    public static void main(String... args) {
        DotNew dn = new DotNew();
        DotNew.Inner dni = dn.new Inner();
    }
}
