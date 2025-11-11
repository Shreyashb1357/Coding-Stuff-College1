package Touris;


@LuxuryTax()
public class PremiumTours {
    double c = 1200;
    public double getPerDayRentForCommon(int days , int noPersons) {
        if(days > 6 || noPersons >= 4)
            return c-100;
        return c;
    }
	public double getPerDayRentForSeniors(int days , int noPersons) {
        c -= 100;
        if(days > 6 || noPersons >= 4)
            return c-100;
        return c;
    }
	public double getPerDayRentForWoman(int days , int noPersons) {
        c -= 200;
        if(days > 6 || noPersons >= 4)
            return c - 100;
        return c;
    }

}
