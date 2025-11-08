package Payroll;

public class Saleperson extends Employee
{
    private int sales;

    public Saleperson(int h, float r, int s)
    {
        super(h,r);
        sales=s;
    }

    public int getSales()
    {
        return sales;
    }

    public void setSales(int value)
    {
        sales = value;
    }

    public double income()
    {
        double payment = super.income();
        if (sales >= 25000)
            payment += 0.05 * sales;
        return payment;
    }
}
