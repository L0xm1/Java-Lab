import java.util.Scanner;
public class L6Q2 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        String words[] = str.split(" ");
        int count = 0;
        for (int i = 0; i < words.length; i++)
            count += words[i].length();
        System.out.println("Count of characters (except whitespace): " + count);
    }
}
