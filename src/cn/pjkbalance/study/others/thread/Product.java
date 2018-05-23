package cn.pjkbalance.study.others.thread;

/**
 * Created by jiakang on 2018/5/14.
 */
public class Product implements Runnable {
    private DuckResource resource;
    public Product(DuckResource resource) {
        this.resource = resource;
    }


    @Override
    public void run() {
        while (true)
        resource.product("duck");
    }
}
