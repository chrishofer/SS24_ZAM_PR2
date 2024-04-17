package at.campus02.bank;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class InterestCalculatorTest {
    private InterestCalculator ic;

    @BeforeEach
    void setUp() {
        // hier können wir alles vorbereiten und initalisieren
        // das könnten auch 20 objekte und einige listen sein
        ic = new InterestCalculator();
    }

    @Test
    void interestTest() {
        // execution Phase - wir führen unseren Code im Test aus
        double a = ic.calculateAmountWithInterest(1000, 10);

        // verify Phase - überprüfen ob tatsächliches Ergebnis dem korrekten Ergebnis entspricht
        // ich erwarte 1100 Euro
        Assertions.assertEquals(1100.0, a);

        // kann in test auch noch zweiten Wert zb ueberpruefen
        // eher nur machen wenn es ein sehr ähnlicher Test ist
        a = ic.calculateAmountWithInterest(100, 5);
        Assertions.assertEquals(105, a);


    }
    @Test
    void interestTestOverMultipleYears() {
        double a = ic.calculateAmountWithInterest(1000, 10, 5);

        // verify Phase - überprüfen ob tatsächliches Ergebnis dem korrekten Ergebnis entspricht
        // ich erwarte 1100 Euro
        Assertions.assertEquals(1610.51, a, 0.000001);

    }

}
