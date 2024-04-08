package at.campus02.dogs;

public class Pudel extends Dog {
    private String lieblingsEssen;

    public Pudel(String lieblingsEssen) {
        super("Hund", 0); // sinngemäß Dog("Hund", 0)
        this.lieblingsEssen = lieblingsEssen;
    }

    public Pudel(String name, int alter, String lieblingsEssen) {
        super(name, alter);
        this.lieblingsEssen = lieblingsEssen;
    }

    public void isstBeilage(String beilage){
        // name ist private - können nicht direkt zugreifen -> aber über getter
        // alter ist protected -> können zugreifen
        System.out.println(getName() + "(" + alter+") isst "+ lieblingsEssen + " Beilage:" + beilage);
    }

    public String getLieblingsEssen() {
        return lieblingsEssen;
    }

    public void setLieblingsEssen(String lieblingsEssen) {
        this.lieblingsEssen = lieblingsEssen;
    }
}
