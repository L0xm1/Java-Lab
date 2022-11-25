import java.util.Scanner;
public class L6Q6 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        String alphabets = "abcdefghijklmnopqrstuvwxyz";
        boolean flag = true;
        for (int i = 0; i < alphabets.length(); i++)
        {
            if (str.toLowerCase().indexOf(alphabets.charAt(i)) == -1)
            {
                flag = false;
                break;
            }
        }
        if (flag)
            System.out.println("The string contains all alphabets");
        else
            System.out.println("The string does not contain all alphabets");
    }
}
