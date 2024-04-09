package at.campus02.hasen;
import java.util.List;
import java.util.ArrayList;

public class Hasenstall {
    private List<Hase> all;

    public Hasenstall(){

        all = new ArrayList<>();
    }
    public void addHase(Hase h){
        if(!all.contains(h)) {
            all.add(h);
        }
    }
    public void hoppelAll(){
        for(Hase h : all){
            h.hoppeln();
        }

    }

    // lässt jeden hasen hoppeln und
    // weihnachtshasen zusätzlich geschenke verteilen
    // und osterhasen eier verteilen
    public void hoppelSpecial(){

        // hinweis:jeder hase der in der liste ist wurde bereits upgecasted
        // sonst könnte er nicht in der liste sein
        for(Hase h : all){

            h.hoppeln();
            // liefert uns nur true wenn h ein Osterhase (oder eine davon abgeleitete Klasse ist)
            if(h instanceof Osterhase){
                // hier können wir sicher downcasten, weil wir zuvor überprüft haben
                // ob auf h wirklich ein Osterhase ist
                Osterhase osti = (Osterhase)h;
                osti.versteckeOstereier();
            }
            if(h instanceof Weihnachtshase){
                // hier können wir sicher downcasten, weil wir zuvor überprüft haben
                // ob auf h wirklich ein Weihnachtshase ist
                Weihnachtshase winti = (Weihnachtshase) h;
                winti.verteileGeschenke();
            }
        }

    }
}