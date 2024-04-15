package at.campus02.sort;



import at.campus02.dogs.Dog;
import at.campus02.dogs.DogAgeComparator;
import at.campus02.dogs.DogAgeNameComparator;
import at.campus02.dogs.DogNameComparator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArraySortTest {

    public static void main(String[] args) {
        int [] zahli = {1,2,77,3}; // new int[10]


        for(int zahl : zahli){
            System.out.println(zahl);
        }

        System.out.println(Arrays.toString(zahli));

        // Hilfsmethoden zum Sortieren - das Sortieren selbst ist schon umgesetzt
        Arrays.sort(zahli);
        System.out.println(Arrays.toString(zahli));

        String [] stringi = {"Hansi", "Anna","Tina", "Tom", "Steffi", "Æ A-12"};

        Arrays.sort(stringi);
        System.out.println(Arrays.toString(stringi));

        // Geht das auch mit eigenen Objekten?
        // nein noch nicht, da java nicht weiß wie wir Hunde sortieren wollen
        Dog [] dogs = {new Dog("Hansi", 19), new Dog("Snuffels", 100)};
        Arrays.sort(dogs); // geht noch nicht
        System.out.println(Arrays.toString(dogs)); // wird absteigend sortiert

        // at.campus02.hasen.Dog d = null; // falls ich gleich benannte Klasse aus anderem Package hier auch verwenden möchte

        String hansi = "Hansi";
        String anna = "Anna";

        // hansi ruft Methode compareTo auf - ist in der Ausführung dieser Methode
        // das this objekt - anna ist der erste Parameter
        hansi.compareTo(anna);

        // in collections ist das genauso möglich
        List<Dog> dogsList = new ArrayList<>();

        dogsList.add(new Dog("Hansi", 17));
        dogsList.add(new Dog("Snuffels", 50));
        System.out.println("*** ArrayList ***");
        // Sortieren mit Collections
        Collections.sort(dogsList);
        System.out.println(dogsList);

        // compartor testen
        dogsList.add(new Dog("Arnold", 5));
        System.out.println("*** Comparator Test *** ");
        Collections.sort(dogsList, new DogNameComparator());

        System.out.println(dogsList);

        System.out.println("*** Comparator Age (aufsteigend) ***");
        dogsList.add(new Dog("Puppy", 0));
        Collections.sort(dogsList, new DogAgeComparator());
        System.out.println(dogsList);

        // umgekehrt sortieren - wir können uns einen reversed Comparator holen
        Collections.sort(dogsList,new DogAgeComparator().reversed());
        System.out.println(dogsList);

        dogsList.add(new Dog("Arabella", 0));
        Collections.sort(dogsList,new DogAgeNameComparator());
        System.out.println(dogsList);



    }
}
