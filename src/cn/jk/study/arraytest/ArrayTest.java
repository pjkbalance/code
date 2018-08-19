package cn.jk.study.arraytest;

/**
 * 数组创建
 * Created by jiakang on 2018/5/7.
 */
public class ArrayTest {
    public static void main(String[] args) {
        int[] intArray = {1,2,3};
        for (int i :
                intArray) {
            System.out.println(i);
        }
        System.out.println("===============================================");
        ClassTest[] classTestArray = {new ClassTest(), new ClassTest(5)};
        for (ClassTest classTest :
                classTestArray) {
            System.out.println(classTest.marker);
        }

        intArray = new int[5];
        classTestArray = new ClassTest[5];
        
        
    }
}
