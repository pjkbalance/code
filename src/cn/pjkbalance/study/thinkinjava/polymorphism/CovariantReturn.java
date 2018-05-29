package cn.pjkbalance.study.thinkinjava.polymorphism;

/**
 * Created by jiakang on 2018/5/29.
 */
class Grain {
    @Override
    public String toString() {
        return "Grain{}";
    }
}

class Wheat extends Grain {
    @Override
    public String toString() {
        return "Wheat{}";
    }
}

class Wheat1 extends Grain {
    @Override
    public String toString() {
        return "Wheat1{}";
    }
}

class Mill {
    Grain process() {
        return new Grain();
    }
}

class WheatMill extends Mill {
    @Override
    Wheat process() {
        return new Wheat();
    }

/*    @Override
    Wheat1 process() {
        return new Wheat1();
    }
 */
}

public class CovariantReturn {
}
