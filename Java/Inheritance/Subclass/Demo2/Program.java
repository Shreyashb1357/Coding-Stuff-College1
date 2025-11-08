public class Program {
    
    private static void Print(String name , Object val)
    {
        System.out.printf("%s = %s%n", name , val.toString());
    }

    private static boolean checkIdentity(Object p, Object q)
    {
        return p == q;
    }

    private static boolean checkEquality(Object p , Object q)
    {
        return p.hashCode() == q.hashCode() && p.equals(q);
    }



    public static void main(String[] args)
    {
        Interval a = new Interval(5, 270);
        Interval b = new Interval(7, 500);
        Interval c = new Interval(10,300);
        Interval d = a;

        Print("The Interval a ", a);
        Print("The Interval b ", b);
        Print("The Interval c ", c);
        Print("The Interval d ", d);
        System.out.println("========================================");

        System.out.printf("The check equals for a & b : %b%n", checkIdentity(a,b));
        System.out.printf("The check equals for b & c : %b%n", checkIdentity(b,c));
        System.out.printf("The check equals for a & c : %b%n", checkIdentity(a,c));     
        System.out.printf("The check equals for d & a : %b%n", checkIdentity(d,a));                                      
                                 

        System.out.println("========================================");

        System.out.printf("The check equals for a & b : %b%n", checkEquality(a,b));
        System.out.printf("The check equals for b & c : %b%n", checkEquality(b,c));
        System.out.printf("The check equals for a & c : %b%n", checkEquality(a,c)); 
        System.out.printf("The check equals for d & a : %b%n", checkEquality(d,a)); 

        System.out.println("========================================");

    }
}
