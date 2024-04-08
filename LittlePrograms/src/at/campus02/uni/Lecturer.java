package at.campus02.uni;

public class Lecturer extends Person{

    private String favoriteTopic;
    public Lecturer(String name, String favTopic) {
        super(name);
        favoriteTopic = favTopic;

    }

    @Override
    public void getInfo() {
        System.out.println("Lecturer " + name + " loves talking about " + favoriteTopic);
    }
}
