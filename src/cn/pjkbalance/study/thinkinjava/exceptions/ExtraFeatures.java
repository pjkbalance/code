package cn.pjkbalance.study.thinkinjava.exceptions;

/**
 * Created by jiakang on 2018/7/16.
 */
class MyException2 extends Exception {
    private int x;
    public MyException2() {}
    public MyException2(String msg) {super(msg);}
    public MyException2(String msg, int x) {
        super(msg);
        this.x = x;
    }
    public int val() {return x;}
    @Override
    public String getMessage() {
        return "Detail Message: "+x+" "+super.getMessage();
    }
}
public class ExtraFeatures {
    public static void f() throws MyException2 {
        System.out.print("from f");
        throw new MyException2();
    }
    public static void g() throws MyException2 {
        System.out.print("from g");
        throw new MyException2("test");
    }
    public static void h() throws MyException2 {
        System.out.print("from h");
        throw new MyException2("test", 47);
    }

    public static void main(String... args) {
        try {
            f();
        } catch (MyException2 myException2) {
            myException2.printStackTrace(System.out);
        }
        try {
            g();
        } catch (MyException2 myException2) {
            myException2.printStackTrace();
        }
        try {
            h();
        } catch (MyException2 myException2) {
            myException2.printStackTrace(System.out);
            System.out.println(myException2.val());
        }
    }
}
