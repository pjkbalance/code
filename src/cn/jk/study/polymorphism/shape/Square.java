package cn.jk.study.polymorphism.shape;

import cn.jk.study.util.Print;

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
