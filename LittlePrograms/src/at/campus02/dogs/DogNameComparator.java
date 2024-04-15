package at.campus02.dogs;

import java.util.Comparator;

// aufsteigend nach hundenamen sortiert
public class DogNameComparator implements Comparator<Dog> {
    @Override
    public int compare(Dog o1, Dog o2) {
        return o1.getName().compareTo(o2.getName());
    }

}
