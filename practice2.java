import java.util.Scanner;
public class practice2 
{
    public static void main(String args[])
    {
        rectangle myrectangle = new rectangle(4.0, 6.0);
        System.out.println("The length is " + myrectangle.getLength());
        System.out.println("The width is " + myrectangle.getWidth());
        System.out.println("The area is " + myrectangle.getArea());
        System.out.println("The perimeter is " + myrectangle.getPerimeter());
        myrectangle.setLength(5.0);
        myrectangle.setWidth(7.0);
        System.out.println("The length is " + myrectangle.getLength());
        System.out.println("The width is " + myrectangle.getWidth());
        System.out.println("The area is " + myrectangle.getArea());
        System.out.println("The perimeter is " + myrectangle.getPerimeter());
        myrectangle.setLength(21.0);
        myrectangle.setWidth(21.0);
        System.out.println("The length is " + myrectangle.getLength());
        System.out.println("The width is " + myrectangle.getWidth());
        System.out.println("The area is " + myrectangle.getArea());
        System.out.println("The perimeter is " + myrectangle.getPerimeter());
    }
}

class rectangle
{
    double length;
    double width;

    rectangle()
    {
        length = 0;
        width = 0;
    }
    rectangle(double l, double w)
    {
        length = l;
        width = w;
    }
    void setLength(double l)
    {
        if (l < 0 || l > 20)
            System.out.println("Invalid length");
        else
            length = l;
    }
    void setWidth(double w)
    {
        if (w < 0 || w > 20)
            System.out.println("Invalid width");
        else
            width = w;
    }
    double getLength()
    {
        return length;
    }
    double getWidth()
    {
        return width;
    }
    double getArea()
    {
        return length * width;
    }
    double getPerimeter()
    {
        return 2 * (length + width);
    }

}