package at.campus02.hasen;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class App {

    public static void main(String[] args) {
        Osterhase oster = new Osterhase("Bugs", 100);
        Weihnachtshase weihnachshase = new Weihnachtshase("Roger");

        oster.hoppeln();
        oster.versteckeOstereier();
        weihnachshase.hoppeln();
        weihnachshase.verteileGeschenke();

        // up- und downcasting

        //upcasting Osterhase zu Hase -> spezialisierter typ zu generellem typ
        Hase hase1 = oster;
        hase1.hoppeln(); // osterhase implementation wird verwendet
        // es werden uns nur die methoden der Hase Klasse angeboten (nicht Osterhase)

       // hier passiert ganz viel - sind jetzt in einer anderen methode

        // wenn wirklich ein Osterhase dahinter ist-> downcasten
        Osterhase oster2 = (Osterhase) hase1; //downcasten funktioniert
        oster2.versteckeOstereier();


        System.out.println("**********************");

        // aber nicht immer - ein Weihnachtshase kann nicht zu einem Osterhasen konvertiert werden
        // weil Attribute und Methoden des Osterhasen fehlen
        //oster2 = (Osterhase)weihnachshase;

        Hasenstall hs = new Hasenstall();
        hs.addHase(oster);
        hs.addHase(weihnachshase);

        hs.hoppelAll();

        System.out.println("#######################");
        hs.addHase(new Hase("Bunni"));

        hs.hoppelSpecial();



        // Party part
        Hedgehog sonic = new Hedgehog(10000, "Sonic (R)");

        System.out.println("***** ***** *****");

        List<PartyGoer> invited = new ArrayList<>();
        invited.add(weihnachshase);
        invited.add(oster);
        invited.add(sonic);

        for(PartyGoer p : invited){
            p.party("drinks");
        }

        System.out.println("***** Comparatortest *****");
        List<Hase> hasenList = new ArrayList<>();

        hasenList.add(new Hase("Hansi", 10000, 19));
        hasenList.add(new Hase("Hansi-Klon", 100, 19));
        hasenList.add(new Hase("Ann", 100, 5));
        hasenList.add(new Hase("Morgane", 100000, 2));

        Collections.sort(hasenList, new HasenAlterKarottenComparator());
        System.out.println(hasenList);




    }

}
