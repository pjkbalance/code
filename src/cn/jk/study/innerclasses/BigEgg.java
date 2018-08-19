package cn.jk.study.innerclasses;

import cn.jk.study.util.Print;

/**
 * Created by jiakang on 2018/6/5.
 */
class Egg {
    private Yolk y;
    protected class Yolk {
        public Yolk() {
            Print.print("Egg.yolk");
        }
    }
    public Egg() {
        Print.print("new egg");
        y = new Yolk();
    }
}
public class BigEgg extends Egg{
    public class Yolk {
        public Yolk() {Print.print("big egg yolk");}
    }
}
