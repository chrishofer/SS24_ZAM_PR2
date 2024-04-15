package at.campus02.dogs;


import java.util.Comparator;

// ganz oft wollen wir auf basis mehrerer Attribute sortieren
// hier zuerst nach Alter (aufsteigend) und falls gleich dann nach Name (aufsteigend)
public class DogAgeNameComparator implements Comparator<Dog> {
    @Override
    public int compare(Dog o1, Dog o2) {
        int cmp = Integer.compare(o1.getAlter(), o2.getAlter());
        if(cmp != 0){
            // alter ist schon unterschiedlich - müssen Namen nicht mehr berücksichtigen
            return cmp;
        }
        // falls alter gleich wäre
        return o1.getName().compareTo(o2.getName());
    }
}
