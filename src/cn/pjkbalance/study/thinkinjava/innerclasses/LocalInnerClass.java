package cn.pjkbalance.study.thinkinjava.innerclasses;

import cn.pjkbalance.common.util.Print;
import sun.util.locale.provider.LocaleServiceProviderPool;

/**
 * Created by jiakang on 2018/6/5.
 */
interface Counter {
    int next();
}

public class LocalInnerClass {
    private int count = 0;

    Counter getCounter(final String name) {
        class LocalCounter implements Counter {
            public LocalCounter() {
                Print.print("local counter");
            }

            @Override
            public int next() {
                Print.print(name);
                return count++;
            }
        }
        return new LocalCounter();
    }

    Counter getCounter2(final String name) {
        return new Counter() {
            {
                Print.print("counter");
            }

            @Override
            public int next() {
                Print.print(name);
                return count++;
            }
        };

    }

    public static void main(String... args) {
        LocalInnerClass lic = new LocalInnerClass();
        Counter c1 = lic.getCounter("local inner");
        Counter c2 = lic.getCounter2("anonymous");
        for (int i = 0; i < 5; i++) {
            Print.print(c1.next());
        }
        for (int i = 0; i < 5; i++) {
            Print.print(c2.next());
        }
    }

}
