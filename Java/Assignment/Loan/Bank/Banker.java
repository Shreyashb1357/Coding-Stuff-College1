package Bank;

public class Banker
{
    public static HomeLoan getHome()
    {
        var l = new HomeLoan();
        return l;
    }

    public static PersonalLoan getPersonal()
    {
        var a = new PersonalLoan();
        return a;
    }
}