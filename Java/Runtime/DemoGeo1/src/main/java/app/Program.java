package app;

import geomentry.*;

public class Program
{
    public static void main(String[] args)
    {
        Circle a = new Circle(20);
        System.out.printf("The area of circle : %.2f%n",a.area());
        System.out.println("-------------------------------------");
        var b= new Rectangle();
        
        System.out.printf("The area of rectangle : %.2f%n",b.area());

    }
}