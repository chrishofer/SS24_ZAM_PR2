package at.campus02.hasen;
import java.util.List;
import java.util.ArrayList;

public class Hasenstall {
    private List<Hase> all;

    public Hasenstall(){

        all = new ArrayList<>();
    }
    public void addHase(Hase h){
        if(!all.contains(h)) {
            all.add(h);
        }
    }
    public void hoppelAll(){
        for(Hase h : all){
            h.hoppeln();
        }

    }
}