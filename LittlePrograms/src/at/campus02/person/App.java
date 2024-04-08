package at.campus02.person;

public class App {
    public static void main(String[] args) {

        Customer c = new Customer("Hansi", "H.", 12);
        c.addAddress(new Address("Hinterseerstraße 12", "8010", "Graz", "Österreich"));



        System.out.println(c);

    }
}
