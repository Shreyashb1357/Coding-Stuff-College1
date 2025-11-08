package Hospital;

class InhousePatient extends Patient 
{
    private double discount;

    InhousePatient(int id, String name, int nd , BedType b, double d) { super(id , name, nd, b); discount = d; };
    InhousePatient(int id, String name, int nd , BedType b) { super(id , name, nd, b);  };

    public double getDis()
    {
        discount = super.getBillAmount() > 5000 ? 0.05 : 0;
        return discount;
    }


    public double getBillAmount()
    {
        double amount = super.getBillAmount();
        double disamt = amount - amount * getDis();
        return disamt;
    }

}

