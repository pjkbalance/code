package cn.pjkbalance.study.thinkinjava.holding;

import cn.pjkbalance.common.util.Print;
import typeinfo.pets.Pet;
import typeinfo.pets.Pets;

import java.util.List;
import java.util.ListIterator;

/**
 * Created by jiakang on 2018/6/7.
 */
public class ListIteration {
    public static void main(String... args){
        List<Pet> pets = Pets.arrayList(8);
        ListIterator<Pet> it = pets.listIterator();
        Print.print(pets);
        while (it.hasNext()){
            Print.print(it.next() +","+it.nextIndex()+","+it.previousIndex());
            Print.print(pets.get(it.previousIndex()));

            Print.print(pets.get(it.nextIndex()));

        }
    }
}
