import Payroll.Employee;
import Payroll.Saleperson;



public class Program {
    

    public static void main(String[] args)
    {
        Employee Shreyash = new Employee(7, 1000 );
        Shreyash.setDailyWages(100);
        Shreyash.setWorkingDays(50);
        Saleperson Jayesh = new Saleperson(15, 150, 10);
        System.out.printf("The Jayesh Will earn : %.2f%n", Jayesh.income());
        System.out.printf("The Shreyash Will earn : %.2f%n", Shreyash.income());
    }
}
