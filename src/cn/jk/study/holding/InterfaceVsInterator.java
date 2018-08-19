package cn.jk.study.holding;

import typeinfo.pets.Pet;
import typeinfo.pets.Pets;

import java.util.*;

/**
 * Created by jiakang on 2018/7/3.
 */
public class InterfaceVsInterator {
    public static void display(Iterator<Pet> it) {
        while (it.hasNext()) {
            Pet pet = it.next();
            System.out.print(pet.id() + " : " + pet);
        }
        System.out.println();
    }

    public static void display(Collection<Pet> pets) {
        for (Pet pet :
                pets) {
            System.out.print(pet.id() + " : " + pet);
        }
        System.out.println();
    }

    public static void main(String... args) {
        List<Pet> petList = Pets.arrayList(8);
        Set<Pet> petSet = new HashSet<>(petList);
        Map<String, Pet> petMap = new LinkedHashMap<>();
        String[] names = "a,b,c,d,e,f,g,h".split(",");
        for(int i = 0; i < names.length; i++) {
            petMap.put(names[i], petList.get(i));
        }
        display(petList);
        display(petSet);
        display(petList.iterator());
        display(petSet.iterator());
        System.out.println(petMap);
        System.out.println(petMap.keySet());
        display(petMap.values());
        display(petMap.values().iterator());
    }

}
