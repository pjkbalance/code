package cn.pjkbalance.study.thinkinjava.holding;

import cn.pjkbalance.common.util.Print;
import com.sun.org.apache.bcel.internal.generic.ARRAYLENGTH;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/**
 * Created by jiakang on 2018/7/4.
 */
class ReversibleArrayList<T> extends ArrayList<T> {
    public ReversibleArrayList(Collection<T> c) {
        super(c);
    }
    public Iterable<T> reversed() {
        return new Iterable<T>() {
            @Override
            public Iterator<T> iterator() {
                return new Iterator<T>() {
                    int current = size() - 1;
                    @Override
                    public boolean hasNext() {
                        return current > -1;
                    }

                    @Override
                    public T next() {
                        return get(current--);
                    }
                };
            }
        };
    }
}
public class AdapterMethodIdiom {
    public static void main(String... args) {
        ReversibleArrayList<String> ral = new ReversibleArrayList<String>(Arrays.asList("the world is very good for me".split(" ")));
        for (String s :
                ral) {
            System.out.print(s+" ");
        }
        Print.print();
        for (String s : ral.reversed()) {
            System.out.print(s+" ");
        }
    }
}
