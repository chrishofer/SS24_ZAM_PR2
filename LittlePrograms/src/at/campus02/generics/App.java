package at.campus02.generics;

import at.campus02.hasen.Osterhase;
import at.campus02.uni.Person;

public class App {

    public static void main(String[] args) {


        Maybe<Person> maybePerson = new Maybe<>(new Person("hansi"), 3);

        Maybe<Osterhase> maybeEasterBunny = new Maybe<>(new Osterhase("Toni", 100), 1);


        System.out.println(maybePerson.getValueIfAllowed());
        Osterhase bunnyRef2 = maybeEasterBunny.getValueIfAllowed();
        System.out.println(bunnyRef2);

    }
}
