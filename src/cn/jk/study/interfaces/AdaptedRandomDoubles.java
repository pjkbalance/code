package cn.jk.study.interfaces;

import cn.jk.study.util.Print;

import java.io.IOException;
import java.nio.CharBuffer;
import java.util.Scanner;

/**
 * Created by jiakang on 2018/5/30.
 */
public class AdaptedRandomDoubles extends RandomDoubles implements Readable {
    private int count;
    public AdaptedRandomDoubles(int i) {
        this.count = i;
    }

    @Override
    public int read(CharBuffer cb) throws IOException {
        if (count-- == 0) {
            return -1;
        }
        String result = Double.toString(this.next());
        cb.append(result);
        return result.length();
    }

    public static void main(String... args) {
        Scanner s = new Scanner(new AdaptedRandomDoubles(7));
        while (s.hasNext()) {
            Print.print(s.next());
        }
    }
}
