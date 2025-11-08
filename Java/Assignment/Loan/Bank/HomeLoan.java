package Bank;

public class HomeLoan extends Loan implements Discountable 
{
    public double limit = 25000;

    public HomeLoan(double p, int t, double l)
    {
        principle = p;
        period = t;
        limit = l;
    }
    public HomeLoan()
    {
        this(0, 0, 25000);
    }

    public void setLimit(double value)
    {
        limit = value;
    }

    public float getRate()
    {
        float r = principle >= 2000000 ? 0.11f : 0.1f;
        if(principle > limit)
            r += 0.01;
        return r;
    }
    
    public double getDiscount()
    {
        double d = getEmi() * 0.10;
        return d;
    }  

    
}

