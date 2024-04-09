package at.campus02.hashmapi;

import at.campus02.hasen.Hase;
import at.campus02.hasen.Osterhase;
import at.campus02.hasen.Weihnachtshase;

import java.util.*;

public class App {
    public static void main(String[] args) {

        // Wiedderholung Hashmap
        // Key: Eindeutigen Häschenidentifikationsnummer (Integer)
        // Value: Hasenobjekt

        HashMap<Integer, Hase> register = new HashMap<>();


        Hase h1 = new Hase("Hansi");
        Hase h2 = new Hase("Susi");
        Hase h3 = new Osterhase("Mr. Easter", 1000);
        Hase h4 = new Weihnachtshase("Fluffels");

        register.put(1001, h1); // hier gibt es kein add sonden put zum einfügen
        register.put(1002, h2);
        register.put(1003, h3);
        register.put(1004, h4);

        //register.put(1001, h4); // wert unter dem schlüssel wird überschrieben

        // können überprüfen ob schlüssen schon in hashmap befindet
        if(register.containsKey(1001))
        {
            System.out.println("Yaayy 1001 regristriert");
        }
        // get: Wert aus Hashmap lesen wenn wir den Schlüssel kennen
        Hase h = register.get(1002);
        if(h != null) {
            // erwarten uns susi
            System.out.println(h.getName());
        }

        h = register.get(2000); // einzelnen wert aus hashmap lesen
        if(h != null) {
            System.out.println(h.getName());
        }
        else{
            System.out.println("Hase mit Key 2000 existiert nicht");
        }
        // remove: entfernen key/value Paars aus der hashmap
        register.remove(1002);

        System.out.println("###################");
        // keyset: wir iterieren klassischerweise über die schlüssel
        // und mit get können wir uns die einz
        for(Integer haeschenIdentifikationsNummer : register.keySet()){
            Hase ha = register.get(haeschenIdentifikationsNummer);
            ha.hoppeln();
            //System.out.println(ha.getName());
        }
        System.out.println("***********");
        // variante2: direkt über hasen objekte iterieren
        for(Hase ha : register.values()){
            System.out.println(ha.getName());
        }
        System.out.println("***********");
        // variante3: bekomme schlüssel und value über Entry Objekt
        for(Map.Entry<Integer, Hase> haEntry: register.entrySet()){
            System.out.println(haEntry.getKey());
            System.out.println(haEntry.getValue().getName());
        }

        // eine neue hashmap - diesmal ohne hasen :(

        // schlüssel/key: integer (plz)
        // wert: liste mit strings (attraktionen/sehenswürdigkeiten)
        Map<Integer, List<String>> specialList = new HashMap<>();

        //Map<Integer, Map<String, List<String>>> specialMap = new HashMap<>();

        List<String> graz = new ArrayList<>();
        graz.add("Uhrturm");
        graz.add("Kunsthaus");
        graz.add("Doppelwendeltreppe");

        // SPOILER FÜR NÄCHSTES MAL - ARRAYLIST
        // alternativer Weg um über collection zu gehen ("iterieren")
        Iterator<String> iter = graz.iterator();
        System.out.println("ITERATOR BEISPIEL");
        while(iter.hasNext()){
            String str = iter.next();
            System.out.println(str);
        }


        List<String> wien = new ArrayList<>();
        wien.add("Riesenrad");
        wien.add("Belvedere");
        wien.add("Stephansdom");

        specialList.put(8010, graz);
        specialList.put(1010, wien);

        System.out.println("*******************");

        // Aufgabenstellung: Für jede Plz alle Attraktionen aus der Hashmap ausgeben
        for(Integer plz : specialList.keySet()){
            List<String> attr = specialList.get(plz);
            for(String a : attr){
                System.out.println(a);
            }

        }

        //List<String> grazAttr = specialList.get(8010);

        // wrapper klassen
        // das sind nur refernzen
        Integer i;
        Float f;

        i = Integer.valueOf(7); // so sollten wir das machen
        i = 14; // 14 ist primitives int; Integer i ist ein komplexes i
        // warum geht das? autboxing/autounboxing -> wird automatisch umgewandelt

        int y = i;









    }
}
