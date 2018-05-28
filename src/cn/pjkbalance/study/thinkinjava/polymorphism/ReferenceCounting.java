package cn.pjkbalance.study.thinkinjava.polymorphism;

import cn.pjkbalance.common.util.Print;

/**
 * Created by jiakang on 2018/5/28.
 */
class Shared {
    private int refcount = 0;
    private static long counter = 0;
    private final long id = counter++;

    public Shared() {
        Print.print("Create Shared-" + this);
    }

    public void addRef() {
        refcount++;
    }

    protected void dispose() {
        if (--refcount == 0) Print.print("dispose Shared-" + this);
    }

    public String toString() {
        return "Shared-" + id;
    }
}

class Composing {
    private Shared shared;
    private static long counter = 0;
    private final long id = counter++;

    public Composing(Shared shared) {
        Print.print("Create Composing-" + this);
        this.shared = shared;
        this.shared.addRef();
    }

    protected void dispose() {
        Print.print("dispose Composing-" + this);
        shared.dispose();
    }

    public String toString() {
        return "composing-" + id;
    }
}

public class ReferenceCounting {
    public static void main(String... args) {
        Shared shared = new Shared();
        Composing[] cs = {new Composing(shared), new Composing(shared)};
        for (Composing c : cs) {
            c.dispose();
        }
    }
}
