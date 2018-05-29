package cn.pjkbalance.study.thinkinjava.polymorphism.shape;

import cn.pjkbalance.common.util.Print;

/**
 * Created by jiakang on 2018/5/28.
 */
public class Square extends Shape {
    @Override
    public void draw() {
        Print.print("draw a square");
    }

    @Override
    public void erase() {
        Print.print("erase a square");
    }
}
