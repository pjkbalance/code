package cn.pjkbalance.study.thinkinjava.holding;

import typeinfo.pets.Pet;
import typeinfo.pets.Pets;

import java.util.AbstractCollection;
import java.util.Iterator;

/**
 * Created by jiakang on 2018/7/4.
 */
public class CollectionSequence extends AbstractCollection<Pet>{
    private Pet[] pets = Pets.createArray(8);

    @Override
    public Iterator<Pet> iterator() {
        return new Iterator<Pet>() {
            private int index = 0;
            @Override
            public boolean hasNext() {
                return index < pets.length;
            }

            @Override
            public Pet next() {
                return pets[index++];
            }

            @Override
            public void remove() {
                throw new UnsupportedOperationException();
            }
        };
    }

    @Override
    public int size() {
        return pets.length;
    }

    public static void main(String... args) {
        CollectionSequence c = new CollectionSequence();
        InterfaceVsInterator.display(c);
        InterfaceVsInterator.display(c.iterator());
    }
}
