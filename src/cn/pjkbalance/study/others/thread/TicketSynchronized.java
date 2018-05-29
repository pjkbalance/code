package cn.pjkbalance.study.others.thread;

import cn.pjkbalance.common.util.Print;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by jiakang on 2018/5/10.
 */
public class TicketSynchronized implements Runnable {    //设置总票数为100，这里的ticket是成员变量，
    //由于在测试类中new了一次，所以值存在一个，被三个售票窗口共享
    private static Integer ticket = 100;

    @Override
    public void run() {
        //模拟售票
        while (true) {
            //如果票数大于0，继续售票
            synchronized (this) {
                if (ticket > 0) {
                    //为了让线程安全问题效果明显些，加入线程定时休眠Thread.sleep()
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                    }
                    //Thread.currentThread()是线程获取当前线程对象的方法    getName()获取调用者的线程名
                    System.out.println(Thread.currentThread().getName() + "正在售票:" + ticket--);
                }
            }
        }
    }
}