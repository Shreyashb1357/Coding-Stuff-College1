package Payroll;

public class Employee 
{
    private int hours;
    private float rate;

    public Employee(int h, float r)
    {
        hours = h;
        rate = r;
    }

    public Employee()
    {
        this(0, 50);
    }

    public int getWorkingDays()
    {
        return hours/8;
    }

    public void setWorkingDays(int vlaue)
    {
        hours = 8 * vlaue;
    }

    public float getDailyWages()
    {
        return 8 * rate;
    }
    public void setDailyWages(int value)
    {
        rate = value / 8;
    }

    public double income()
    {
        double payment = hours * rate;
        int ot = hours - 180;
        if(ot > 0)
            payment += ot * 50;
        return payment;
    }
}