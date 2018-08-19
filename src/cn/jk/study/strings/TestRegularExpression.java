package cn.jk.study.strings;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by jiakang on 2018/7/26.
 */
public class TestRegularExpression {
    public static void main(String... args) {
        if (args.length < 2) {
            System.exit(0);
        }
        System.out.println(args[0]);

        for (String str : args) {
            System.out.println(str);
            Pattern p = Pattern.compile(str);
            Matcher m = p.matcher(args[0]);
            StringBuffer sb = new StringBuffer("");
            while (m.find()) {
                sb.append("Match \"").append(m.group()).append("\" at positions ").append(m.start()).append("-").append(m.end() - 1);
                System.out.println(sb.toString());
            }
        }


    }
}
