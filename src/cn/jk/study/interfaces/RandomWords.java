package cn.jk.study.interfaces;

import cn.jk.study.util.Print;

import java.io.IOException;
import java.nio.CharBuffer;
import java.util.Random;
import java.util.Scanner;

/**
 * Created by jiakang on 2018/5/30.
 */
public class RandomWords implements Readable {
    private static Random random = new Random(47);
    private static final char[] capitals = "qwertyuiopasdfghjklzxcvbnm.".toUpperCase().toCharArray();
    private static final char[] lowers = "qwertyuiopasdfghjklzxcvbnm.".toCharArray();
    private static final char[] vowels = "aeiou".toCharArray();
    private int count;

    public RandomWords(int count) {
        this.count = count;
    }

    @Override
    public int read(CharBuffer cb) throws IOException {
        if (count-- == 0) {
            return -1;
        }
        cb.append(capitals[random.nextInt(capitals.length)]);
        for (int i = 0; i < 4; i++) {
            cb.append(vowels[random.nextInt(vowels.length)]);
            cb.append(lowers[random.nextInt(lowers.length)]);
        }
        cb.append("asdf");
        return 10;
    }

    public static void main(String... args) {
        Scanner s = new Scanner(new RandomWords(3));
        while (s.hasNext()) {
            Print.print(s.next());
        }
    }
}
