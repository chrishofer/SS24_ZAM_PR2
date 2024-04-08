package at.campus02.dogs;

public class Cat {
    private String name;

    // Defaultkonstruktor
    public Cat(){
        this.name = "Katze";
    }


    public Cat(String name){
        this.name = name;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
