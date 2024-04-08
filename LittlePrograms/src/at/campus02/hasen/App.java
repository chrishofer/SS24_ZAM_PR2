package at.campus02.hasen;

public class App {

    public static void main(String[] args) {
        Osterhase oster = new Osterhase("Bugs");
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




    }

}
