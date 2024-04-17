package at.campus02.bank;

public class InterestCalculator {

    public double calculateAmountWithInterest(double amount, double interest) {
        return calculateAmountWithInterest(amount, interest, 1);
    }
    // interest 10 -> 10 % interest
    public double calculateAmountWithInterest(double amount, double interest, int years){


        // TODO: add support for years
        return amount * Math.pow((1+interest/100), years); // oder: amount + amount * interest/100
    }

    public double testMethode(){
        return 0;
    }
}
