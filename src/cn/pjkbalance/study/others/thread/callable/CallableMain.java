package cn.pjkbalance.study.others.thread.callable;

import cn.pjkbalance.common.util.Print;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

/**
 * Created by jiakang on 2018/5/14.
 */
public class CallableMain {
    public static void main(String... args) {
        List<String> resultList = new ArrayList<>();
        CallableDemo demo = new CallableDemo(10);
        ExecutorService executor = Executors.newFixedThreadPool(10);
        //Future<String> result = executor.submit(demo);
        FutureTask<String> test = new FutureTask<String>(demo);
        executor.submit(test);
        executor.shutdown();
        try {
            /*if (result.get() != null) {
                Print.print(result.get());
            }*/
            if (test.get() != null) {
                Print.print(test.get());
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
    }
}
