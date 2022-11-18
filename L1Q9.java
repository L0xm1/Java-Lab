import java.util.Scanner;

public class L1Q9
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter an amount: ");
		int n = sc.nextInt();
		int denoms[] = {500,200,100,50,20,10,5,2,1};
		int denums[] = new int[denoms.length];
		for (int i=0;i<denoms.length;i++)
		{
			denums[i]=0;
			if (n>=denoms[i])
			{
				denums[i] = n/denoms[i];
				n = n%denoms[i];
			}
		}
		System.out.println("\nDenoms\t:Count");
		for (int i=0;i<denoms.length;i++)
			System.out.println(denoms[i]+"\t:"+denums[i]);
		int sum=0;
		for (int i=0;i<denums.length;i++)
			sum+=denums[i];
		System.out.println("\nThe number of currency notes is: "+sum);
	}
}
