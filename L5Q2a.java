import java.util.Scanner;
public class L5Q2a
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("1. Rectangle\n2. Triangle\n3. Square\nEnter your choice: ");
        int choice = sc.nextInt();
        System.out.print("Enter the dimensions: ");
        Shapes myshape;
        switch (choice)
        {
            case 1:
                myshape = new Rectangle();
                double l = sc.nextDouble();
                double b = sc.nextDouble();
                myshape.area(l,b);
                myshape.perimeter(l,b);
                break;
            case 2:
                myshape = new Triangle();
                double a = sc.nextDouble();
                double h = sc.nextDouble();
                myshape.area(a,h);
                myshape.perimeter(a,h);
                break;
            case 3:
                myshape = new Square();
                double side = sc.nextDouble();
                myshape.area(side,side);
                myshape.perimeter(side,side);
                break;
            default:
                System.out.println("Invalid choice!");
        }
    }
}

interface Shapes
{
    void area(double x, double y);
    void perimeter(double x, double y);
}

class Rectangle implements Shapes
{
    public void area(double x, double y)
    {
        System.out.println("Area of rectangle is: " + (x*y));
    }
    public void perimeter(double x, double y)
    {
        System.out.println("Perimeter of rectangle is: " + (2*(x+y)));
    }
}

class Square implements Shapes
{
    public void area(double x, double y)
    {
        System.out.println("Area of square is: " + (x*x));
    }
    public void perimeter(double x, double y)
    {
        System.out.println("Perimeter of square is: " + (4*x));
    }
}

class Triangle implements Shapes
{
    public void area(double x, double y)
    {
        System.out.println("Area of triangle is: " + (0.5*x*y));
    }
    public void perimeter(double x, double y)
    {
        System.out.println("Perimeter of triangle is: " + (3*x));
    }
}