package at.campus02.hasen;

import java.util.Comparator;

public class HasenAlterKarottenComparator implements Comparator<Hase> {

    @Override
    public int compare(Hase o1, Hase o2) {
        int cmp = Integer.compare(o1.getAlter(), o2.getAlter());
        if(cmp != 0){
            // alter ist schon unterschiedlich - müssen Namen nicht mehr berücksichtigen
            return cmp;
        }
        // falls alter gleich wäre
        return Integer.compare(o1.getAnzKarotten(), o2.getAnzKarotten());

    }
}
