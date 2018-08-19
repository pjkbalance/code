package cn.jk.study.thread.pool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by jiakang on 2018/5/14.
 */
public class FixedThreadPool {
    public static void main(String... args) {
        ExecutorService executor = Executors.newFixedThreadPool(2);
        for(int i = 0; i < 5; i++) {
            executor.execute(new LiftOff(i*2));
        }
        executor.shutdown();
    }
}
