package cn.pjkbalance.study.thinkinjava.holding;

import cn.pjkbalance.common.util.Print;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

/**
 * Created by jiakang on 2018/6/6.
 */
public class AddingGroups {
    public static void main(String[] args) {
        Collection<String> strList = new ArrayList<>(Arrays.asList(new String[] {"one","tow","three"}));
        Collection<String> moreStrList = new ArrayList<>(Arrays.asList("fore","five","six"));
        strList.addAll(moreStrList);
        Collections.addAll(strList, "seven", "eight");
        for (String str :
                strList) {
            Print.print(str);
        }

    }
}
