package cn.jk.study.innerclasses;

import cn.jk.study.util.Print;

/**
 * Created by jiakang on 2018/6/4.
 */
interface Service {
    void method1();
    void method2();
}
interface ServiceFactory {
    Service getService();
}

class Impl1 implements Service {
    @Override
    public void method1() {
        Print.print("impl1 method1");
    }

    @Override
    public void method2() {
        Print.print("impl1 method2");
    }

    public static ServiceFactory factory = new ServiceFactory() {
        @Override
        public Service getService() {
            return new Impl1();
        }
    };
}

class Impl2 implements Service {
    @Override
    public void method1() {
        Print.print("impl2 method1");
    }

    @Override
    public void method2() {
        Print.print("impl2 method2");
    }

    public static ServiceFactory factory = new ServiceFactory() {
        @Override
        public Service getService() {
            return new Impl2();
        }
    };
}
public class Factories {
    public static void serviceConsumer(ServiceFactory factory) {
        Service service = factory.getService();
        service.method1();
        service.method2();
    }
    public static void main(String... args) {
        serviceConsumer(Impl1.factory);
        serviceConsumer(Impl2.factory);
    }
}
