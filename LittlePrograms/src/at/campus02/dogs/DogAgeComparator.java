package at.campus02.dogs;

import java.util.Comparator;

public class DogAgeComparator implements Comparator<Dog> {

    // ACHTUNG ACHTUNG ACHTUNG
    // hier ist es aufsteigend sortiert
    @Override
    public int compare(Dog o1, Dog o2) {
        return Integer.compare(o1.getAlter(), o2.getAlter());
    }
}
