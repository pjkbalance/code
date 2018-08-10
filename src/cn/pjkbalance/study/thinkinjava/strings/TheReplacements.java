package cn.pjkbalance.study.thinkinjava.strings;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by jiakang on 2018/8/7.
 */
public class TheReplacements {
    public static void main(String... args) {
        String s = "/*! Here's  a block of text to  use as input to the regular expression matcher." +
                "   Note that we'll  first extract the block of text by looking for the special delimiters. then process the extracted block.  !*/ hahahaha";
        Matcher inputM = Pattern.compile("/\\*!(.*)!\\*/").matcher(s);
        if (inputM.find()) {
            s = inputM.group(1);
            System.out.println(s+"===get the string");
        }

        s = s.replaceAll(" {2,}"," ");
        System.out.println(s+"===replace all space which more than one");
        s = s.replaceAll("(?m)^ +", "");
        System.out.println(s+"===replace first space");
        s = s.replaceFirst("[aeiou]","(VOWEL1)");
        System.out.println(s+"===replace aeiou to VOWEL1");

        StringBuffer sb = new StringBuffer();
        Pattern p = Pattern.compile("[aeiou]");
        Matcher m = p.matcher(s);
        while (m.find()) {
            m.appendReplacement(sb, m.group().toUpperCase());
            System.out.println(m.group() + "==="+sb);
        }
        System.out.println(sb);
        m.appendTail(sb);
        System.out.println(sb);
    }
}