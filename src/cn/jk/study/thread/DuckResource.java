package cn.jk.study.thread;

import cn.jk.study.util.Print;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by jiakang on 2018/5/14.
 */
public class DuckResource {
    private String name;
    private int count = 1;
    private boolean haveProduct = false;

    private Lock lock = new ReentrantLock();
    Condition product_con = lock.newCondition();
    Condition consumer_con = lock.newCondition();

    public void product(String name) {
        lock.lock();
        try {
            while(haveProduct) {
                product_con.await();
            }
            this.name = name+count++;
            Print.print("["+Thread.currentThread().getName()+"] product "+this.name);
            Thread.currentThread().sleep(1000);
            haveProduct = true;
            consumer_con.signalAll();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }

    public void consumer() {
        lock.lock();
        try {
            while (!haveProduct) {
                consumer_con.await();
            }
            Print.print("["+Thread.currentThread().getName()+"] consumer "+this.name);
            Thread.currentThread().sleep(100);
            haveProduct = false;
            product_con.signalAll();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }
}
