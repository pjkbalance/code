package cn.jk.study.holding;

import cn.jk.study.util.Print;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by jiakang on 2018/6/20.
 */
public class SetOperations {
    public static void main(String... args) {
        Set<String> set1 = new HashSet<>();
        Collections.addAll(set1, "A B C D E F G H I J K L".split(" "));
        set1.add("M");
        Print.print("H: "+set1.contains("H"));
        Print.print("N: "+set1.contains("N"));
        Set<String> set2 = new HashSet<>();
        Collections.addAll(set2, "H I J K L".split(" "));
        Print.print("set2 in set1: "+set1.containsAll(set2));
        set1.remove("H");
        Print.print("set1: "+set1);
        Print.print("set2 in set1: "+set1.containsAll(set2));
        set1.removeAll(set2);
        Print.print(set1);
        Print.print("set2 removed from set1: "+set1.containsAll(set2));
        Collections.addAll(set1, "X Y Z".split(" "));
        Print.print(set1);
    }
}
