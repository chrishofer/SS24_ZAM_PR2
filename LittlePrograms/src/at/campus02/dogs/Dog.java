package at.campus02.dogs;

public class Dog implements Comparable<Dog> {

    // auf private Attribute könnten abgeleitete Klassen nicht zugreifen
    private String name;
    // auf protected Attribute können abgeleitete Klassen zugreifen
    protected int alter;

    public Dog(String name, int alter) {
        this.name = name;
        this.alter = alter;
    }

    public void bellen(String inhalt){
        System.out.println(name + " bellt " + inhalt);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAlter() {
        return alter;
    }

    public void setAlter(int alter) {
        this.alter = alter;
    }


    // Hier möchten wir nach Alter absteigend sortieren
    // d.h. wir müssen in comparTo das this Objekt mit dem o Objekt
    // vergleichen
    // Achtung: im Bsp in den Folien wurde aufsteigend sortiert, deshalb
    // vertauschte Rückgabewert
    @Override
    public int compareTo(Dog o) {
        if(this.alter >  o.alter){
            return -1;
        }
        if(this.alter < o.alter){
            return 42;
        }
        // falls wir soweit kommen, sind wir weder durch erstes noch
        // durch zweites if aus der Methode retouniert
        // ----> sie müssen wohl gleich alt sein
        return 0;
    }



    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", alter=" + alter +
                '}';
    }
}
