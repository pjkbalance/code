package cn.pjkbalance.study.thinkinjava.polymorphism.shape;

/**
 * Created by jiakang on 2018/5/28.
 */
public class Shapes {
    private static RandomShapeGenerator gen = new RandomShapeGenerator();

    public static void main(String... args) {
        Shape[] shapes = new Shape[9];
        for (int i = 0; i < shapes.length; i++) {
            shapes[i] = gen.next();
        }
        for (Shape shape : shapes) {
            shape.draw();
            shape.extra();
        }
    }
}
