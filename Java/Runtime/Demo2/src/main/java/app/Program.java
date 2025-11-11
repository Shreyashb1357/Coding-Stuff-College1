package app;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.reflect.Method;

import Finance.*;

public class Program  {
    public static void main(String[] args)throws Throwable{
        double amt = Double.parseDouble(args[0]);
        Class<?> c = Class.forName("Finance."+args[1]);
        Object policy = c.getConstructor().newInstance();
        Method scheme = c.getMethod(args[2],double.class, int.class);
        var deptr = MethodHandles.lookup()
        .unreflect(scheme)    
        .bindTo(policy);
        for(int n = 1;n<=10;++n)
            System.out.printf("chalo chale neel gagan mein {0}",deptr.invoke(amt,n));
        
    }
    
}