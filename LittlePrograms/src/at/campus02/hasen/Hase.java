package at.campus02.hasen;

public class Hase implements PartyGoer  {
    protected String name;
    protected int anzKarotten;
    protected int alter;

    public Hase(String n) {
        this.name = n;
        // Falls wir Attribute erweitern müssen wir uns auch Gedanken
        // darüber machen ob wir bestehende Konstruktoren verändern
        this.alter = 0;
        this.anzKarotten = 100;
    }
    public Hase(String n, int anzKarotten, int alter){
        this.name = n;
        this.anzKarotten = anzKarotten;
        this.alter = alter;
    }

    public int getAnzKarotten() {
        return anzKarotten;
    }

    public void setAnzKarotten(int anzKarotten) {
        this.anzKarotten = anzKarotten;
    }

    public int getAlter() {
        return alter;
    }

    public void setAlter(int alter) {
        this.alter = alter;
    }

    public void schlafen() {
        System.out.println(name + " schläft gemütlich");
    }

    public void hoppeln() {
        System.out.println(name + " hoppelt durch den Wald");
    }

    public void fressen() {
        System.out.println(name + " isst genüsslich eine Karotte");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void party(String bringsWith) {
        System.out.println("Rabbit " + name +" goes to party and brings " + bringsWith);
    }

    @Override
    public String toString() {
        return "Hase{" +
                "name='" + name + '\'' +
                ", anzKarotten=" + anzKarotten +
                ", alter=" + alter +
                '}';
    }
}