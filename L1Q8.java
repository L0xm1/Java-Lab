import java.util.Scanner;

public class L1Q8
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int n = sc.nextInt();
		int i = 1;
		while (i<=n)
		{
			System.out.print(i+" ");
			i+=2;
		}
		System.out.print("\n");
	}
}
