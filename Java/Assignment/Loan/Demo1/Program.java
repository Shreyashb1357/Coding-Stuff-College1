import Bank.*;
import java.util.Scanner;

public class Program
{
    public static void main(String[] args)
    {
        var jayesh = Banker.getHome();
        jayesh.setPeriod(2);
        jayesh.setPrinciple(5000000);

        System.out.printf("The emi of Jayesh will be : %.2f%n", jayesh.getEmi());
        System.out.printf("The discount of Jayesh will be : %.2f%n", jayesh.getDiscount());

        System.out.println("======================================================");

        var Shreyash = Banker.getPersonal();
        Shreyash.setPeriod(2);
        Shreyash.setPrinciple(50000);

        System.out.printf("The emi of Jayesh will be : %.2f%n", Shreyash.getEmi());
        System.out.printf("The discount of Jayesh will be : %.2f%n", Shreyash.getTax());

        System.out.println("======================================================");
        
        //System.out.printf("The emi of Jayesh will be : %.2f%n", Shreyash.LoanDetail());
        Shreyash.LoanDetail();
        System.out.println("======================================================");
        jayesh.LoanDetail();
        var input = new Scanner(System.in);
        





    }
}