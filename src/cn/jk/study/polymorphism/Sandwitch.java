package cn.jk.study.polymorphism;

import cn.jk.study.util.Print;

/**
 * Created by jiakang on 2018/5/28.
 */
class Meal {
    Meal() {
        Print.print("Meal");
    }
}

class Bread {
    Bread() {
        Print.print("Bread");
    }
}

class Cheese {
    Cheese() {
        Print.print("Cheese");
    }
}

class Lettuce {
    Lettuce() {
        Print.print("Lettuce");
    }
}

class Lunch extends Meal {
    Lunch() {
        Print.print("Lunch -> Meal");
    }
}

class PortableLunch extends Lunch {
    PortableLunch() {
        Print.print("PortableLunch -> Lunch");
    }
}

public class Sandwitch extends PortableLunch {
    Lunch l1 = new Lunch();
    private Bread b = new Bread();
    private Cheese c = new Cheese();
    private Lettuce l = new Lettuce();

    public Sandwitch() {
        Print.print("Sandwitch -> PortableLunch");
    }

    public static void main(String... args) {
        new Sandwitch();
    }

}
