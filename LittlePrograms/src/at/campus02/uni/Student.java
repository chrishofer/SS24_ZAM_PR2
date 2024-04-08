package at.campus02.uni;

public class Student extends Person{
    // hier haben wir natürlich ganz viele weitere Attribute und Methoden

    public Student(String name) {
        super(name); // ruft Konstrutkor der Basisklasse auf
    }

    @Override
    public void getInfo() {
        System.out.println("Student " + name + " is studying");
        //super.getInfo(); // ruft Implementierung der Basisklasse auf


    }

    public void learn(){
        System.out.println( name + " learns");
    }

    // wir können auch methode überladen - dann keine Annotation
  //  public void getInfo(String text){}
}
