package at.campus02.uni;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        Student s = new Student("Christoph");

        s.getInfo();

        Mentor m = new Mentor("Mentori", "Programming");

        m.getInfo();

        List<Person> everybody = new ArrayList<>();
        everybody.add(s);
        everybody.add(m);

        for(Person p : everybody){
            p.getInfo();
        }


        // upcasten

        Person p2 = s; // das geht ohne probleme, da wir (=Java)
        // wissen, dass Student sich von Person ableitet

        s.learn(); // Student auf Studentenreferenz kann lernen
        // p2.learn geht nicht, da Student auf Personenreferenz und deshalb
        // nur die Methoden und Attribute der Personenklasse angeboten werden
        // ABER: bei Methodenüberschreibung wird die "neueste" Implementierung ausgeführt

        // downcasten
        // Student s2 = p2; - geht nicht da Student spezieller als Person ist (=abgeleitet)
        Student s2 = (Student)p2; // wenn ich explizit caste dann ist downcast erlaubt
        // ACHTUNG: auf meine verantwortung - es *kracht* falls das nicht stimmt

        Person p3 = m;
        // Student s3 = m; das geht natuerlich nicht
        // das ist aber falsch, da auf p3 ein Mentor ist
        // ClassCastException weil Java einen Mentor in einen STudenten umwandeln will
        // und das geht natürlich nicht
        // Student s3 = (Student)p3; // das kann ich machen (explizit downcasten) -> aber stürzt ab :(

        // Pause 14:03

        for(Person p : everybody){
            sendLetter(p);
        }

        sendLetter(m);
        sendLetter(s);

    }

    public static void sendLetter(Person p){

        System.out.println("Sending letter to " + p.getName());
    }
}
