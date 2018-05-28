package cn.pjkbalance.study.thinkinjava.varargs;

/**
 * Created by jiakang on 2018/5/7.
 */
public class VarArgs {
    static void printArray(Object[] objArray) {
        System.out.println("===== print array =====");
        for (Object obj :
                objArray) {
            System.out.println(obj.toString());
        }
        System.out.println();
    }

    public static void main(String[] args) {
        printArray(new Object[]{new Integer(123), new Float(3.1415)});
        printArray(new Object[]{"one", "two"});
        printArray(new Object[]{new ClassTest(), new ClassTest()});
    }
}
