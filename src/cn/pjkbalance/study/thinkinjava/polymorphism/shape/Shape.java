package cn.pjkbalance.study.thinkinjava.polymorphism.shape;

import cn.pjkbalance.common.util.Print;

/**
 * Created by jiakang on 2018/5/28.
 */
public class Shape {
    public void draw() {
        Print.print("draw a shape");
    }

    public void erase() {
        Print.print("erase a shape");
    }

    public void extra() {
        Print.print("shape-extra");
    }
}
