import java.util.Scanner;
public class L6Q5 
{
    public static void main(String args[])
    {
        //Display frequency of each character
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        char chars[] = str.toCharArray();
        int freq[] = new int[chars.length];
        for (int i = 0; i < chars.length; i++)
        {
            freq[i] = 1;
            for (int j = i + 1; j < chars.length; j++)
                if (chars[i] == chars[j])
                {
                    freq[i]++;
                    chars[j] = '0';
                }
        }
        for (int i = 0; i < freq.length; i++)
        {
            if (chars[i] != ' ' && chars[i] != '0')
                System.out.println(chars[i] + " - " + freq[i]);
        }

    }
}

