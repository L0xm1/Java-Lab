import java.util.Scanner;
public class L3Q1
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		Shape shape = new Shape();
		System.out.print("Enter side of square: ");
		System.out.println("Area of square: "+shape.area(sc.nextInt()));
		System.out.print("Enter length and breadth: ");
		System.out.println("Area of rectangle: "+shape.area(sc.nextInt(), sc.nextInt()));
	}
}

class Shape
{
	public int area(int a)
	{
		return a*a;
	}

	public int area(int a, int b)
	{
		return a*b;
	}
}
