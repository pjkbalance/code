package cn.pjkbalance.study.others.thread.pool;

import cn.pjkbalance.common.util.Print;

/**
 * Created by jiakang on 2018/5/14.
 */
public class LiftOff implements Runnable{
    private  int  countDown = 10;
    private static int taskCount = 0;
    private final int id = taskCount++;

    public LiftOff() {}
    public LiftOff(int countDown) {
        this.countDown = countDown;
    }

    public String status() {
        return "#"+id+" ===>>> "+ (countDown > 0 ? countDown : "lift off");
    }

    @Override
    public void run() {
        while(countDown-- > 0) {
            Print.print(status());
            //Thread.yield();
        }
    }
}
