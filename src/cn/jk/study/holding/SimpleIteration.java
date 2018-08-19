package cn.jk.study.holding;

import cn.jk.study.util.Print;
import typeinfo.pets.Pet;
import typeinfo.pets.Pets;

import java.util.Iterator;
import java.util.List;

/**
 * Created by jiakang on 2018/6/7.
 */
public class SimpleIteration {
    public static void main(String... args) {
        List<Pet> pets = Pets.arrayList(12);
        Iterator<Pet> it = pets.iterator();
        while(it.hasNext()) {
            Pet pet = it.next();
            System.out.print(pet.id() + "="+pet+" ");
        }
        Print.print();
        for(Pet pet : pets) {
            System.out.print(pet.id() + "="+pet+" ");
        }
        Print.print();
        it = pets.iterator();
        for (int i = 0; i < 6; i++) {
            Pet pet = it.next();
            System.out.print(pet.id() + "="+pet+" ");
            it.remove();
        }
        Print.print();
        Print.print(pets);
    }
}
