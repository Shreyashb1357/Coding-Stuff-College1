package taxation;

public interface Taxation {
    
    double annualIncome();

    //default interface method - is an instance method 
    //defined in an interface with a specific implementation
    default double incomeTax() {
        double i = annualIncome();
        return i > 120000 ? 0.15 * (i - 120000) : 0;
    }
}