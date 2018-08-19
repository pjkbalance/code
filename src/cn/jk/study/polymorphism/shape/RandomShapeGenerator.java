package cn.jk.study.polymorphism.shape;

import java.util.Random;

/**
 * Created by jiakang on 2018/5/28.
 */
public class RandomShapeGenerator {
    private Random random = new Random();

    public Shape next() {
        switch (random.nextInt(3)) {
            case 0:
                return new Circle();
            case 1:
                return new Square();
            case 2:
                return new Triangle();
            default:
                return new Shape();
        }
    }
}
