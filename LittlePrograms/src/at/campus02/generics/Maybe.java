package at.campus02.generics;

public class Maybe<T> {
    private T value;
    private String description;
    /**
     * status values defines if we are allowed to get value
     * 1... everybody can access
     * 10.. everybody + ad partners can access
     * 2 .. deleted
     * 3 .. privacy not allowed
     */
    private int status;

    public Maybe(T value, int status) {
        this.value = value;
        this.status = status;
    }

    // Rückgabewert soll nur geliefert werden
    // wenn status den Wert 1 oder 10 hat
    public T getValueIfAllowed(){
        if(status == 1 || status == 10){
            return value;
        }
        return null;
    }
}
