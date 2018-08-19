package cn.jk.study.interfaces;

import cn.jk.study.util.Print;

/**
 * Created by jiakang on 2018/5/31.
 */
interface Service {
    void method1();

    void method2();
}

interface ServiceFactory {
    Service getService();
}

class Implementation1 implements Service {
    @Override
    public void method1() {
        Print.print("1 === method1");
    }

    @Override
    public void method2() {
        Print.print("1 === method2");
    }
}

class Implemention1Factory implements ServiceFactory {
    @Override
    public Service getService() {
        return new Implementation1();
    }
}

class Implementation2 implements Service {
    @Override
    public void method1() {
        Print.print("2 === method1");
    }

    @Override
    public void method2() {
        Print.print("2 === method2");
    }
}

class Implemention2Factory implements ServiceFactory {
    @Override
    public Service getService() {
        return new Implementation2();
    }
}

public class Factories {
    public static void serviceConsumer(ServiceFactory factory) {
        Service s = factory.getService();
        s.method1();
        s.method2();
    }

    public static void main(String... args) {
        serviceConsumer(new Implemention1Factory());
        serviceConsumer(new Implemention2Factory());
    }
}
