package cn.jk.study.thread;

import cn.jk.study.util.Print;

/**
 * Created by jiakang on 2018/5/10.
 */
public class TreadSleep extends Thread {
    int marker;
    TreadSleep(int marker) {
        this.marker = marker;
    }
    @Override
    public void run() {
        try {
            Print.print(marker+"===001");
            sleep(100);
            Print.print(marker+"===002");
            sleep(200);
            Print.print(marker+"===003");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
