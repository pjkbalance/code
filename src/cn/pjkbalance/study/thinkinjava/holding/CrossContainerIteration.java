package cn.pjkbalance.study.thinkinjava.holding;

import cn.pjkbalance.common.util.Print;
import typeinfo.pets.Pet;
import typeinfo.pets.Pets;

import java.util.*;

/**
 * Created by jiakang on 2018/6/7.
 */
public class CrossContainerIteration {
    public static void display(Iterator<Pet> it) {
        while (it.hasNext()) {
            Pet p = it.next();
            System.out.print(p.id()+"="+p+" ");
        }
        Print.print();
    }

    public static void main(String... args){
        ArrayList<Pet> pets = Pets.arrayList(8);
        LinkedList<Pet> petLL = new LinkedList(pets);
        HashSet<Pet> petHS = new HashSet<>(pets);
        TreeSet<Pet> petTS = new TreeSet<>(pets);
        display(pets.iterator());
        display(petLL.iterator());
        display(petHS.iterator());
        display(petTS.iterator());
    }

}
