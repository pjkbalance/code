package cn.pjkbalance.study.thinkinjava.interfaces.nesting;

/**
 * Created by jiakang on 2018/5/31.
 */
class A {
    interface B {
        void f();
    }

    public class BImplF implements B {
        @Override
        public void f() {
        }
    }

    public class BImplS implements B {
        @Override
        public void f() {
        }
    }

    public interface C {
        void f();
    }

    public class CImplF implements C {
        @Override
        public void f() {
        }
    }

    public class CImplS implements C {
        @Override
        public void f() {
        }
    }

    private interface D {
        void f();
    }

    private class DImplF implements D {
        @Override
        public void f() {
        }
    }

    public class DImplS implements D {
        @Override
        public void f() {
        }
    }

    public D getD() {
        return new DImplS();
    }

    private D dRef;

    public void receiveD(D d) {
        dRef = d;
        dRef.f();
    }
}

interface E {
    interface G {
        void f();
    }

    public interface H {
        void f();
    }

    void g();
}

public class NestingInterfaces {
    public class BImpl implements A.B {
        @Override
        public void f() {
        }
    }

    class CImpl implements A.C {
        @Override
        public void f() {
        }
    }

    class EImplF implements E {
        @Override
        public void g() {
        }
    }

    class EGImpl implements E.G {
        @Override
        public void f() {
        }
    }

    class EImplS implements E, E.G {
        @Override
        public void f() {

        }

        @Override
        public void g() {

        }
    }

    class EImplT implements E {
        @Override
        public void g() {

        }

        class EGImpl implements E.G {
            @Override
            public void f() {

            }
        }
    }
}
