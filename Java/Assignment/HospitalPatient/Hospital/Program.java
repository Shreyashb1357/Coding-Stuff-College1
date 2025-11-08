package Hospital;


public class Program
{
    public static void main(String[] args)
    {
        Patient j = new Patient(11, "Jayesh", 5 , BedType.economy);
       
        System.out.printf("The bill of jayesh = %.2f%n",  j.getBillAmount());

        InhousePatient a = new InhousePatient(12 , "Milind", 10, BedType.delux);
        System.out.printf("The bill of Milind = %.2f%n",  a.getBillAmount());
    }
}