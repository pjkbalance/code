package cn.pjkbalance.study.thinkinjava.staticinitialization;

/**
 * Created b``````````````````````````````````````````````````````````````````y jiakang on 2018/5/7.
 */
public class Table {
    static Bowl bowl1 = new Bowl(1);

    Table() {
        System.out.println("Table");
        bowl2.f(2);
    }

    void f(int marker) {
        System.out.println("Table.f(" + marker + ")");
    }

    static Bowl bowl2 = new Bowl(2);
}
