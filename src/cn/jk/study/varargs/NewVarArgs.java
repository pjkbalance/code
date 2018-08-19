package cn.jk.study.varargs;

/**
 * 可变参数
 * Created by jiakang on 2018/5/7.
 */
public class NewVarArgs {
    static void printArray(Object... objArray) {
        System.out.println("===== print array =====");
        for (Object obj :
                objArray) {
            System.out.println(obj.toString());
        }
        System.out.println();
    }

    //static void printArray(Object... objArray, ClassTest classTest) {
    static void printArray(ClassTest classTest, Object... objArray) {
        System.out.println("===== print classTest & array =====");
        for (Object obj :
                objArray) {
            System.out.println(obj.toString());
        }
        System.out.println();
    }

    public static void main(String[] args) {
        printArray(123, 3.1415);
        printArray(new Object[]{new Integer(123), new Float(3.1415)});
        System.out.println();
        printArray("one", "two");
        printArray(new Object[]{"one", "two"});
        System.out.println();
        printArray(new ClassTest(), new ClassTest());
        printArray(new Object[]{new ClassTest(), new ClassTest()});
        System.out.println();
        printArray(new ClassTest(), "one", "two");
    }
}