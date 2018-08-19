package cn.jk.study.thread;

import cn.jk.study.util.Print;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by jiakang on 2018/5/14.
 */
public class TicketLock implements Runnable {
    private Lock ticketLock = new ReentrantLock(true);
    private int num = 100;

    @Override
    public void run() {
        while(true) {
            try {
                ticketLock.lock();
                if (num > 0) {
                    Thread.sleep(10);
                    Print.print("[" + Thread.currentThread().getName() + "]ticket num = " + num--);
                } else {
                    break;
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                Print.print(Thread.currentThread().getName()+"unlock");
                ticketLock.unlock();
            }
        }
    }

}
