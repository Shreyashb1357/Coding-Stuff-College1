package Bank;

public abstract class Loan 
{
    protected double principle;
    protected int period;

    public void setPrinciple(int value)
    {
        principle = value;
    }

    public void setPeriod(int value)
    {
        period = value;
    }


    public abstract float getRate();
    public void LoanDetail()
    {
        if(this instanceof HomeLoan)
        {
            System.out.printf("The principal : %.2f%n", principle);
            System.out.printf("The rate will be : %.2f%n", getRate());
            System.out.printf("The Emi for HomeLoan will be : %.2f%n", getEmi());
        }else if(this instanceof PersonalLoan) 
        {
            System.out.printf("The principal : %.2f%n", principle);
            System.out.printf("The rate will be : %.2f%n", getRate());
            System.out.printf("The Emi for PersonalLoan will be : %.2f%n", getEmi());
                        
        }
    }

    public double getEmi()
    {
        double emi = principle * (1 + getRate() * period / 100) / (12 * period);
        return emi;
    }
} 
