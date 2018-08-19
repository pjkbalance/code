package cn.jk.study.holding;

import cn.jk.study.util.Print;
import typeinfo.pets.*;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by jiakang on 2018/6/20.
 */
public class MapOfList {
    public static Map<Person, List<? extends Pet>> petPeople = new HashMap<Person, List<? extends Pet>>();
    static {
        petPeople.put(new Person("Dawn"), Arrays.asList(new Cymric("Molly"), new Mutt("Spot")));
        petPeople.put(new Person("Kate"), Arrays.asList(new Cat("Shackleton"), new Cat("Elsie May"), new Pet("a")));
    }
    public static void main(String... args) {
        for (Person person :
                petPeople.keySet()) {
            System.out.print(person + " has: ");
            for (Pet pet : petPeople.get(person)) {
                System.out.print(pet+"; ");
            }
            Print.print();

        }
    }
}
