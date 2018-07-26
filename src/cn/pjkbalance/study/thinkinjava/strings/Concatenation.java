package cn.pjkbalance.study.thinkinjava.strings;

import com.sun.corba.se.impl.protocol.giopmsgheaders.LocateReplyMessage_1_0;

import java.util.Formatter;
import java.util.Random;

/**
 * Created by jiakang on 2018/7/26.
 */
public class Concatenation {
    public static void main(String... args ){
        /*String mango = "mango";
        String mango1 = "mango1";
        System.out.println(mango == mango);
        System.out.println(mango == mango1);
        mango1 = mango;
        System.out.println(mango == mango1);
        mango1 = mango + "";
        System.out.println(mango == mango1);

        String s = "abc"+mango+"test";
        System.out.println(s);*/

/*        Random random = new Random(4);
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < 20; i++) {
            sb.append(random.nextInt(10)+",");
//            sb.append();
        }
        System.out.print(sb.toString());*/
        System.out.printf("Row: %d, %f \n",11,11f);
        System.err.printf("Row: %d, %f \n",12,12f);

        Formatter f = new Formatter(System.err);
        f.format("row: %s is %s", "a" , "A");
    }
}
