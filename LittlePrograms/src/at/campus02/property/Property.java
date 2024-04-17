package at.campus02.property;

public class Property implements Comparable<Property>{

    private String owner;
    private double area;
    private String cadastreNumber;
    private String zipCode;

    public Property(String owner, double area) {
        this.owner = owner;
        this.area = area;
        cadastreNumber = "";
        zipCode = "";
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public String getCadastreNumber() {
        return cadastreNumber;
    }

    public void setCadastreNumber(String cadastreNumber) {
        this.cadastreNumber = cadastreNumber;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    // Aufsteigend nach Fläche(area) sortieren
    @Override
    public int compareTo(Property o) {

        if(this.area < o.area){
            return -1;
        }
        if(this.area > o.area){
            return 1;
        }
        return 0;
    }

    @Override
    public String toString() {
        return "Property Besitzer*in='" + owner + "; " + area ;
    }
}
