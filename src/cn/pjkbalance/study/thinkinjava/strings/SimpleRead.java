package cn.pjkbalance.study.thinkinjava.strings;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.StringReader;

/**
 * Created by jiakang on 2018/8/10.
 */
public class SimpleRead {
    public static BufferedReader input = new BufferedReader(new StringReader("Sir Robin of Camelot\n22 1.618"));
    public static void main(String... args) {
        try {
            System.out.println("What is your name");
            String name = input.readLine();
            System.out.printf("%s",name);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
