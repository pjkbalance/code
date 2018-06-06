package cn.pjkbalance.study.thinkinjava.holding;

import cn.pjkbalance.common.util.Print;

import java.util.*;

/**
 * Created by jiakang on 2018/6/6.
 */
public class PrintingContainers {
    static Collection fill(Collection<String> collection) {
        collection.add("one");
        collection.add("two");
        collection.add("three");
        return collection;
    }

    static Map fill(Map<String, String> map) {
        map.put("one","value1");
        map.put("two","value2");
        map.put("three","value3");
        return map;
    }

    public static void main(String... args) {
        Print.print(fill(new ArrayList<String>()));
        Print.print(fill(new HashMap<String, String>()));
    }

}
