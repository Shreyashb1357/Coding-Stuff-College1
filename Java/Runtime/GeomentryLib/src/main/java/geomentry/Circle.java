package geomentry;

public class Circle extends Shape
{
    private double radius;
    public double getRadius() {
        return radius;
    }

    public void setRadius(int value) {
        radius = value; 
    }

    public Circle(double r) {
        radius = r;
    }

    public double area()
    {
        return 3.14 * Math.pow(radius , 2);
    }
}