import java.util.Scanner;

public class L1Q5
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter 3 numbers: ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int second;
		if (a>b && a>c)
		{
			if (b>c)
				second = b;
			else
				second = c;
		}
		else if (b>c)
		{
			if (a>c)
				second = a;
			else
				second = c;
		}
		else
		{
			if (b>a)
				second = b;
			else
				second = a;
		}
		System.out.println("The second largest is: "+second);
	}
}
