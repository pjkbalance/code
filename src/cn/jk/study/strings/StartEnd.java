package cn.jk.study.strings;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by jiakang on 2018/7/27.
 */
public class StartEnd {
    public static String input = "Whever As long as there is injustice, whenever a ever\n" +
            "Targathian baby cries out, wherever a distress\n" +
            "Signal sounds among the stars ... We'll be there.\n" +
            "This fine ship, and this fine crew ...\n" +
            "Never give up! Never surrender!";

    private static class Display {
        private boolean regexPrinted = false;
        private String regex;

        Display(String regex) {
            this.regex = regex;
        }

        void display(String message) {
            if (!regexPrinted) {
                System.out.println(regex);
                regexPrinted = true;
            }
            System.out.println(message);
        }

        static void examine(String s, String regex) {
            Display d = new Display(regex);
            Pattern p = Pattern.compile(regex);
            Matcher m = p.matcher(s);

            while (m.find()) {
                d.display("find() '" + m.group() + "' start = " + m.start() + "; end = " + m.end());
            }

            if (m.lookingAt()) {
                d.display("lookingAt() start = " + m.start() + "; end = " + m.end());
            }
            if (m.matches()) {
                d.display("matches() start = " + m.start() + "; end = " + m.end());
            }
        }

        public static void main(String... args) {
            for (String in : input.split("\n")) {
                System.out.println("input : " + in);
                for (String regex : new String[]{"\\w*ever\\w*", "\\w*ever", "T\\w+", "Never.*?!"}) {
                    examine(in, regex);
                    System.out.println();
                }
                System.out.println("==================================================================");
            }

            //Pattern.compile("\\)").split("test)haha)boom!", 2)
            for (String s : "test)haha)boom!".split("\\)", 2)) {
                System.out.println(s);
            }
        }

    }
}
