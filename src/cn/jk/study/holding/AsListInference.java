package cn.jk.study.holding;

import java.util.Arrays;
import java.util.List;

/**
 * Created by jiakang on 2018/6/6.
 */
class Snow {}
class Powder extends Snow {}
class Light extends Powder {}
class Heavy extends Powder {}
class Crusty extends Snow {}
class Slush extends Snow {}
public class AsListInference {
    public static void main(String... args) {
        List<Snow> snow1 = Arrays.asList(new Snow(), new Crusty(), new Slush());
        List<Snow> snow2 = Arrays.asList(new Light(), new Heavy());
    }
}
