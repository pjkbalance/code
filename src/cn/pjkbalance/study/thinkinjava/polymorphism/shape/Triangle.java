package cn.pjkbalance.study.thinkinjava.polymorphism.shape;

import cn.pjkbalance.common.util.Print;

/**
 * Created by jiakang on 2018/5/28.
 */
public class Triangle extends Shape {
    @Override
    public void draw() {
        Print.print("draw a triangle");
    }

    @Override
    public void erase() {
        Print.print("erase a triangle");
    }
}
