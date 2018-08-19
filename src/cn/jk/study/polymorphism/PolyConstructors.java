package cn.jk.study.polymorphism;

import cn.jk.study.util.Print;

/**
 * create Glyph -- before draw
 * RoundGlyph draw radius == 0
 * create Glyph -- after draw
 * RoundGlyph radius == 3
 *
 * Created by jiakang on 2018/5/29.
 */
class Glyph {
    void draw() {
        Print.print("Glyph draw");
    }

    Glyph() {
        Print.print("create Glyph -- before draw");
        draw();
        Print.print("create Glyph -- after draw");
    }
}

class RoundGlyph extends Glyph {
    private int radius = 1;

    RoundGlyph(int r) {
        radius = r;
        Print.print("RoundGlyph radius == " + radius);
    }

    @Override
    void draw() {
        Print.print("RoundGlyph draw radius == " + radius);
    }
}

public class PolyConstructors {
    public static void main(String... args) {
        new RoundGlyph(3);
    }
}
