package cn.pjkbalance.study.thinkinjava.holding;

import cn.pjkbalance.common.util.Print;
import typeinfo.pets.Cat;
import typeinfo.pets.Dog;
import typeinfo.pets.Hamster;
import typeinfo.pets.Pet;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by jiakang on 2018/6/20.
 */
public class PetMap {
    public static void main(String... args) {
        Map<String, Pet> petMap = new HashMap<String, Pet>();
        petMap.put("my cat",new Cat("molly"));
        petMap.put("my dog", new Dog("Ginger"));
        petMap.put("my hamster", new Hamster("Bosco"));
        Print.print(petMap);
        Pet dog = petMap.get("my dog");
        Print.print(dog);
        Print.print(petMap.containsKey("my dog"));
        Print.print(petMap.containsValue(dog));
        Print.print(petMap.containsValue(new Dog("Ginger")));
    }
}
