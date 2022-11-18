import java.util.Scanner;


interface Polygon
{
    public void getArea();
}

class Square implements Polygon
{
    private double side;
    public Square(double side)
    {
        this.side = side;
    }
    public void getArea()
    {
        System.out.println("Area of square: " + side*side);
    }
}

class Rectangle implements Polygon
{
    private double length;
    private double breadth;
    public Rectangle(double length, double breadth)
    {
        this.length = length;
        this.breadth = breadth;
    }
    public void getArea()
    {
        System.out.println("Area of rectangle: " + length*breadth);
    }
}

public class L4Q3 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter side of square: ");
        double side = sc.nextDouble();
        Square s = new Square(side);
        s.getArea();
        System.out.print("Enter sides of rectangle: ");
        double length = sc.nextDouble();
        double breadth = sc.nextDouble();
        Rectangle r = new Rectangle(length, breadth);
        r.getArea();
    }
}