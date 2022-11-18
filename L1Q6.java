import java.util.Scanner;

public class L1Q6
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int n = sc.nextInt();
		if (n%6==0)
			System.out.println("The number is divisible by 6");
		else
			System.out.println("The number is not divisible by 6");
	}
}
