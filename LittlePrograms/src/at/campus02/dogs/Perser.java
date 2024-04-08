package at.campus02.dogs;

public class Perser extends Cat {

    private int haarLaenge;

    // falls es keinen Konstruktor in der Basisklasse gibt existiert nur
    // der Defaultkonstrukor (der ist ohne Parameter)
    // dann wird dieser automatisch zu Beginn des Konstruktors aufgerufen
    public Perser(String name){
       // hier wird der Konstruktor ohne Parameter aufgerufen falls dieser existiert
        // und kein explizites super(..) von uns hingeschrieben wird
        super(name);

    }
    public Perser(){
        // hier wird der Defaultkonstruktor aufgerufen falls dieser existiert
        // und kein explizites super(..) von uns hingeschrieben wird
        //super(); // jetzt geht es weil er existiert, aber nicht notwendig weils automatisch gemacht wird

        haarLaenge = 10;
    }


}
