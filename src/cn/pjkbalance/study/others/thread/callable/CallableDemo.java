package cn.pjkbalance.study.others.thread.callable;

import java.util.concurrent.Callable;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by jiakang on 2018/5/14.
 */
public class CallableDemo implements Callable<String> {
    private int result = 100;
    private Lock loc = new ReentrantLock();
    private int marker = 10;
    public CallableDemo(int marker) {
        this.marker = marker;
    }
    @Override
    public String call() throws Exception {
        return (this.marker*2+1)+"";
    }
}
