import java.util.Scanner;
public class L5Q5 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        try
        {
            int c = a/b;
            if (b%4!=0)
                throw new IncorrectNumberDivision("b is not divisible by 4");
            System.out.println("The quotient is: " + c);
        }
        catch (ArithmeticException e)
        {
            System.out.println("Division by zero is not possible!");
        }
        catch (IncorrectNumberDivision e)
        {
            System.out.println(e);
        }
    }
}

class IncorrectNumberDivision extends Exception
{
    public IncorrectNumberDivision(String s)
    {
        super(s);
    }
}
