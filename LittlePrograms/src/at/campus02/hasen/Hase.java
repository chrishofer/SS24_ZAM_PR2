package at.campus02.hasen;

public class Hase implements PartyGoer  {
    protected String name;

    public Hase(String n) {
        this.name = n;
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
}