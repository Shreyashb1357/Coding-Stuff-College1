package Touris;

public class EconomyTours {
    public double getDaysRent(int days , int noPersons) {
        if(days > 6 || noPersons >= 4)
            return 500-100;
        return 500;
    }
}