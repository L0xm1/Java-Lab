import java.util.Scanner;
import java.math;
public class L4Q2 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        Shape myshape = new Shape();
        System.out.print("Enter side of square: ");
        double side = sc.nextDouble();
        System.out.println("Area of square: " + myshape.area(side));
        System.out.print("Enter sides of rectangle: ");
        double length = sc.nextDouble();
        double breadth = sc.nextDouble();
        System.out.println("Area of rectangle: " + myshape.area(length, breadth));
        System.out.print("Enter sides of triangle: ");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        System.out.println("Area of triangle: " + myshape.area(a, b, c));
    }
}

class Shape
{
    public double area(double a)
    {
        return a*a;
    }

    public double area(double l, double b)
    {
        return l*b;
    }

    public double area(double a, double b, double c)
    {
        double s = (a+b+c)/2;
        return Math.sqrt(s*(s-a)*(s-b)*(s-c));
    }
}