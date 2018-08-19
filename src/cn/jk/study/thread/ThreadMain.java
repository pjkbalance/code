package cn.jk.study.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by jiakang on 2018/5/10.
 */
public class ThreadMain {
    public static void main(String... s) {
        //testThreat();
        //testSleep();
        //testTicket();
        //testProductConsume();
        testThreadPool();
    }

    private static void testThreadPool() {
        ExecutorService threadPool = Executors.newFixedThreadPool(5);
    }

    //测试生产者消费者
    private static void testProductConsume() {
        DuckResource resource = new DuckResource();
        Thread t1 = new Thread(new Product(resource), "product1");
        Thread t2 = new Thread(new Product(resource), "product2");
        Thread t3 = new Thread(new Consumer(resource), "consumer1");
        Thread t4 = new Thread(new Consumer(resource), "consumer2");
        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }

    private static void testTicket() {
        //TicketSynchronized ticket = new TicketSynchronized();
        TicketLock ticket = new TicketLock();
        //创建线程3个对象模拟三个售票窗口，并把Runnable对象加入Thread和给Thread命名
        new Thread(ticket,"窗口1").start();;
        new Thread(ticket,"窗口2").start();;
        new Thread(ticket,"窗口3").start();;
    }

    private static void testSleep() {
        Thread t1 = new TreadSleep(1);
        Thread t2 = new TreadSleep(2);
        Thread t3 = new TreadSleep(3);
        Thread t4 = new TreadSleep(4);
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        //no work
        try {
            t1.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private static void testThreat() {
        ThreadByExtends t1 = new ThreadByExtends();
        ThreadByRunnable t2 = new ThreadByRunnable();
        Thread t3 = new Thread(t2,"test");

        t1.start();
        t3.start();
    }
}
