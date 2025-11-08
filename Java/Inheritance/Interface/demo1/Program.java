import taxation.Supervisor;
import taxation.Worker;

public class Program
{
    public static void doAuditing(String name, int count)
    {
        Auditor a = new Auditor();
        if(count > 10)
            a.audit(name, new Worker(count));
        else
            a.audit(name, new Supervisor(count));
        a.close();
    }



    public static void main(String[] args)
    {
        try
        {
            String a = args[0].toUpperCase();
            int b = Integer.parseInt(args[1]);
            doAuditing(a, b);
        }
        catch(Exception e){
            System.out.printf("Error: %s%n", e.getMessage());
        }


    }
}