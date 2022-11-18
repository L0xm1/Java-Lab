import java.util.Scanner;

public class L1Q2
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter 2 numbers: ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		if (a>b)
			System.out.println("The largest is: "+a);
		else
			System.out.println("The largest is: "+b);
	}
}
