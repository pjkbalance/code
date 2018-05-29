package cn.pjkbalance.study.others.thread;

/**
 * Created by jiakang on 2018/5/14.
 */
public class Consumer implements Runnable{
    private DuckResource resource;
    public Consumer(DuckResource resource) {
        this.resource = resource;
    }
    @Override
    public void run() {
        while (true) {
            resource.consumer();
        }
    }
}
