package cn.pjkbalance.common.util;

import java.util.LinkedList;

/**
 * Created by jiakang on 2018/6/12.
 */
public class Stack<T> {
    private LinkedList<T> storage = new LinkedList<>();

    public void push(T t) {
        storage.addFirst(t);
    }

    public T peek() {
        return storage.getFirst();
    }

    public T pop() {
        return storage.removeFirst();
    }

    public boolean empty() {
        return storage.isEmpty();
    }

    @Override
    public String toString() {
        return storage.toString();
    }
}