package cn.jk.study.strings;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by jiakang on 2018/7/26.
 */
public class Groups {
    static public final String POEM = "j.k peng is a good man, \n" +
            "j.k peng is a bad man; \n" +
            "j.k is too bad to be killed.\n";
    private static Pattern p = Pattern.compile("(?m)((\\S+)(\\s+))$");
    private static Pattern p1 = Pattern.compile("(\\S+)((\\s+)$)");
    public static void main(String... args) {
        Matcher m = p.matcher(POEM);
        while (m.find()) {
            for (int j = 0; j <= m.groupCount(); j++) {
                System.out.print("["+j+"-"+m.group(j)+"]");
            }
            System.out.println();
        }
    }
}
