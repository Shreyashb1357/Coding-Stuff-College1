package app;
import Touris.*;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.reflect.Method;

public class Program {

    public static void main(String[] args) throws Throwable
    {
       Class <?> c = Class.forName("Touris." + args[0]);
       Object obj = c.getConstructor().newInstance();
       //getMethod(object_method , double.class, int.class)
       Method meth = c.getMethod(args[1] , int.class , int.class);
       MethodHandle handle = MethodHandles.lookup()
            .unreflect(meth)
            .bindTo(obj);
        int days = Integer.parseInt(args[2]);
        int person = Integer.parseInt(args[3]);

        LuxuryTax lux = c.getAnnotation(LuxuryTax.class);
        int l = lux != null ? lux.value() : 1;


        double rate = (double) handle.invoke(days, person);
        double payment = days * l * rate * person;


        System.out.println("----------------------------------------");
        System.out.printf("The rate for %s will be : %.2f%n", c.getName(), rate);
        System.out.printf("The total payment will be : %.2f%n", payment);
       
    }
}


/*Takes a normal Java Method (called scheme) that you probably got using reflection.
Turns it into a faster, low-level “function pointer” (a MethodHandle) so you can call it more efficiently.
Locks it to a specific object (policy), so whenever you use it, it will always call that method on that object.*/