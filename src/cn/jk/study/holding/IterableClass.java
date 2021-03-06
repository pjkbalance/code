package cn.jk.study.holding;

import cn.jk.study.util.Print;

import java.util.Iterator;

/**
 * Created by jiakang on 2018/7/4.
 */
public class IterableClass implements Iterable<String> {
    private String[] words = "The World is very bad for me".split(" ");

    @Override
    public Iterator<String> iterator() {
        return new Iterator<String>() {
            private int index;
            @Override
            public boolean hasNext() {
                return index < words.length;
            }

            @Override
            public String next() {
                return words[index++];
            }
        };
    }
    
    public static void main(String... args) {
        for (String s :
                new IterableClass()) {
            Print.print(s);
        }

        /*for (Map.Entry entry :
                System.getenv().entrySet()) {
            Print.print(entry.getKey()+": "+entry.getValue());

        }*/
    }
}
