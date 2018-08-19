package cn.jk.study.polymorphism.shape;

import cn.jk.study.util.Print;

/**
 * Created by jiakang on 2018/5/28.
 */
public class Circle extends Shape {
    @Override
    public void draw() {
        Print.print("draw a circle");
    }

    @Override
    public void erase() {
        Print.print("erase a circle");
    }

    @Override
    public void extra() {
        Print.print("circle-extra");
    }
}
