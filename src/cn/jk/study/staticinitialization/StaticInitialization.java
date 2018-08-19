package cn.jk.study.staticinitialization;

/**
 * 静态变量创建顺序
 * Created by jiakang on 2018/5/7.
 */
public class StaticInitialization {
    public static void main(String[] args) {
        System.out.println("create cupboard in main");
        new Cupboard();
        System.out.println("create cupboard in main");
        new Cupboard();
        //table.f(1);
        cupboard.f(1);
    }

    static Cupboard cupboard = new Cupboard();
    //static Table table = new Table();
}
