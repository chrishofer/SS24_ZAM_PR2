package at.campus02.property;

import java.util.Comparator;

public class AreaComparator implements Comparator<Property> {

    // Fläche absteigend sortieren
    @Override
    public int compare(Property o1, Property o2) {
        if(o1.getArea() < o2.getArea()){
            return 1;
        }
        if(o1.getArea() > o2.getArea()){
            return -1;
        }
        return 0;
    }
}
