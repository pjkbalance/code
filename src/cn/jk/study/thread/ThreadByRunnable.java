package cn.jk.study.thread;

import cn.jk.study.util.Print;

/**
 * Created by jiakang on 2018/5/8.
 */
public class ThreadByRunnable implements Runnable {

    @Override
    public void run() {
        Print.print("I'm a thread that extends Thread1");
    }
}
