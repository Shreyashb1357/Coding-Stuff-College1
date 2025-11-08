package Hospital;

public class Patient
{
    private int patientId;
    private String patientName;
    private int noOfDays;
    private BedType bed;

    public Patient(int id, String name, int nd , BedType b)
    {
        patientId = id;
        patientName = name;
        noOfDays = nd;
        bed = b;        
    }
    

    public int getPId()
    {
        return patientId;
    }

    public String getPName()
    {
        return patientName;
    }

    public int getnoOfDays()
    {
        return noOfDays;
    }


    public double getPricePerDay() 
    {
        switch(bed) {
            case economy: return 200;
            case premium : return 350;
            case delux : return 500;
            default : return 0;
        }
    }

    public double getBillAmount()
    {
        double amount = noOfDays * getPricePerDay();
        return amount;
    }

}

