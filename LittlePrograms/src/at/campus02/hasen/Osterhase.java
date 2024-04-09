package at.campus02.hasen;

public class Osterhase extends Hase {

    protected int nrEggs;

    public Osterhase(String n, int nrEggs) {
        super(n);
        this.nrEggs = nrEggs;
    }

    public void versteckeOstereier() {
        System.out.println(name + " versteckt ganz viele bunte selbstgemachte nachhaltige regionale Demeter (Schokoladen)Eier");
    }

    @Override
    public void hoppeln() {
        System.out.println("Osterhase " + name + " springt durch die Luft und versteckt "+ nrEggs +" Eier");
    }

    @Override
    public void party(String bringsWith) {
        System.out.println(name + " throws away "
         + bringsWith + " and brings carrot cake to party");
    }
}