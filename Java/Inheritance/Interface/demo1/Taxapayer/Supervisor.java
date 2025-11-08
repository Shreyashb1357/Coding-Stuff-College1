package taxation;

public class Supervisor implements Taxation {
    
    private int subordinates;

    public Supervisor(int subordinates) {
        this.subordinates = subordinates;
    }

    public double annualIncome() {
        return 480000 + 4000 * subordinates;
    }
}