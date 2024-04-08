package at.campus02.uni;

public class Mentor extends Lecturer{
    private boolean happy;
    public Mentor(String name, String favTopic) {
        super(name, favTopic);
        happy = true;
    }
}
