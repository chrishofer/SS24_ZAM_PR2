package at.campus02.dogs;

public class App {
    public static void main(String[] args) {
        Dog d = new Dog("Wuffi", 2);

        d.bellen("wuff wuff");

        Pudel bello = new Pudel("Bello", 5, "Kartoffel");
        // Pause bis 9:52
        bello.bellen("bell bell");
        bello.isstBeilage("Fleisch");
        System.out.println(bello.getAlter());

        Perser p = new Perser();

        Perser p2 = new Perser("Mona");
        System.out.println(p2.getName());

    }
}
