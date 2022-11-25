import java.util.Scanner;
public class L6Q3 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        String words[] = str.split(" ");
        String shortest = words[0];
        for (int i = 1; i < words.length; i++)
            if (words[i].length() < shortest.length())
                shortest = words[i];
        System.out.println("Shortest word is: " + shortest);
    }   
}
