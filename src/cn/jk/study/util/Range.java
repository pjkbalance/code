package cn.jk.study.util;

/**
 * Created by jiakang on 2018/5/7.
 */
public class Range {
    public static int[] range(int n) {
        int[] array = new int[n];
        for (int i = 0; i < n; i++){
            array[i] = i;
        }
        return array;
    }

    public static int[] range(int start, int end) {
        int[] array = new int[end - start];
        for (int i = start; i < end; i++){
            array[i] = i;
        }
        return array;
    }

    public static int[] range(int start, int end, int step) {
        int size = (end - start) / step;
        int[] array = new int[size];
        for (int i = start; i < end; i++){
            array[i] = start + (i * step);
        }
        return array;
    }
}
