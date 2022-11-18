import java.util.Scanner;
public class L5Q1
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of square matrix: ");
        int n = sc.nextInt();
        int a[][] = new int[n][n];
        System.out.println("Enter the elements of the matrix: ");
        for (int i=0;i<n;i++)
            for (int j=0;j<n;j++)
                a[i][j] = sc.nextInt();
        System.out.println("The matrix is: ");
        for (int i=0;i<n;i++)
        {
            for (int j=0;j<n;j++)
                System.out.print(a[i][j] + " ");
            System.out.println();
        }
        int sum = 0;
        for (int i=0;i<n;i++)
            for (int j=i;j<n;j++)
                sum += a[i][j];
        System.out.println("The sum of upper triangle is: " + sum);
        sum = 0;
        for (int i=0;i<n;i++)
            for (int j=0;j<=i;j++)
                sum += a[i][j];
        System.out.println("The sum of lower triangle is: " + sum);
    }
}