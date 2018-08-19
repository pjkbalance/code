package cn.jk.study.holding;

import java.util.PriorityQueue;
import java.util.Random;

/**
 * Created by jiakang on 2018/6/20.
 */
public class PriorityQueueDemo {
    public static void main(String... args) {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<Integer>();
        Random rand = new Random(47);
        for (int i = 0; i < 10 ; i++) {
            priorityQueue.offer(rand.nextInt(i + 10));

        }
    }
}
