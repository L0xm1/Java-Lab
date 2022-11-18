import java.util.Scanner;

public class L1Q3
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter 3 numbers: ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d;
		if (a>b && a>c)
			d = a;
		else if (b>c)
			d = b;
		else
			d = c;
		System.out.println("The largest is: "+d);
	}
}
