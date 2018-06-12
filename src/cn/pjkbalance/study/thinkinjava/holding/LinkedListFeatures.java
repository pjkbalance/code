package cn.pjkbalance.study.thinkinjava.holding;

import cn.pjkbalance.common.util.Print;
import typeinfo.pets.*;

import java.util.LinkedList;

/**
 * Created by jiakang on 2018/6/12.
 */
public class LinkedListFeatures {
    public static void main(String... args) {
        LinkedList<Pet> pets = new LinkedList<>(Pets.arrayList(5));
        Print.print(pets);
        Print.print("pets.getFirst(): "+pets.getFirst());
        Print.print("pets.element(): "+pets.element());
        Print.print("pets.peek(): "+pets.peek());
        Print.print();
        Print.print("pets.remove(): "+pets.remove());
        Print.print("pets.removeFirst(): "+pets.removeFirst());
        Print.print("pets.poll(): "+pets.poll());
        Print.print(pets);
        Print.print();
        pets.addFirst(new Rat());
        Print.print(pets);
        pets.add(new Rat());
        pets.offer(new Pug());
        pets.addLast(new Hamster());
        Print.print(pets);

    }
}
