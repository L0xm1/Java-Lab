import java.util.Scanner;

public class L1Q4
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the height of the rectangle: ");
		int h = sc.nextInt();
		System.out.print("Enter the width of the rectangle: ");
		int w = sc.nextInt();
		System.out.println("The area of the rectangle is: "+(h*w));
		System.out.println("The perimeter of the rectangle is: "+2*(h+w));
	}
}
