package Bank;

public class PersonalLoan extends Loan implements Taxable
{

    public float getRate()
    {
        float r = principle >= 500000 ? 0.16f : 0.15f;
        return r;
    }

    public double getTax()
    {
        double tax = getEmi() * 0.18;
        return tax;
    }

    

}