package app;
import Finance.*;
import java.util.Scanner;
// import Finance.EducationLoan;
// import Finance.HomeLoan;
// import Finance.Loan;
// import Finance.PersonalLoan;


public class Program {
    
    public static void main(String[] args) throws Exception {
       System.out.printf("The monthly : %.2f%n", Loan.monthlyInstallment(5005520,2,6));
        Scanner scr = new Scanner(System.in);

        System.out.printf("How much amount you want to invest:");
       double p = Double.parseDouble(scr.nextLine());
       int m = 10;
       
        System.out.printf("Which scheme you want to Invest: ");
        String ss = scr.nextLine();

       for(int n = 1; n<=m; ++n) {
            float r = 
                switch(ss) {
                    case "HomeLoan" -> new HomeLoan().common(p,n);
                    case "EducationLoan" -> new EducationLoan().common(p,n);
                    case "PersonalLoan" -> new PersonalLoan().common(p,n);
                    default -> throw new IllegalArgumentException("Invalid Policy");
                };
            double emi = Loan.monthlyInstallment(p,n,r);
            System.out.printf("%-6d%16.2f%n", n , emi);
        }
        
    }
}


