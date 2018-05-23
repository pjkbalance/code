package cn.pjkbalance.study.others.thread;

import cn.pjkbalance.common.util.Print;

/**
 * Created by jiakang on 2018/5/8.
 */
public class ThreadByExtends extends Thread {
    @Override
    public void run() {
        /*try {
            this.currentThread().interrupted();
            Print.print("thread is interrupted === "+*//*this.currentThread().*//*isInterrupted());
            sleep(10);
            Print.print("thread is interrupted === "+isInterrupted());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }*/
        int i = 0;
        while(i < 10) {
            Print.print("I'm a thread that extends Thread === "+isInterrupted());
            interrupt();
            try {
                sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            i++;
        }
    }
}
