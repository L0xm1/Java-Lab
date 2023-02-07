import java.util.Scanner;

public class practice1 
{
    public static void main(String args[])
    {
        Money cash1 = new Money(10, 50);
        Money cash2 = new Money(5, 75);
        System.out.print("Cash1 = ");
        cash1.display();
        System.out.print("Cash2 = ");
        cash2.display();
        System.out.print("Cash1 + Cash2 = ");
        cash1.add(cash2).display();
        System.out.print("Cash1 - Cash2 = ");
        cash1.subtract(cash2).display();
    }

}

class Money
{
    private int rupees;
    private int paisa;

    Money()
    {
        rupees = 0;
        paisa = 0;
    }
    Money(int r, int p)
    {
        rupees = r;
        paisa = p;
    }
    Money(Money m)
    {
        rupees = m.rupees;
        paisa = m.paisa;
    }
    Money(int r)
    {
        rupees = r;
        paisa = 0;
    }
    Money add(Money m)
    {
        Money result = new Money(this.rupees + m.rupees + (this.paisa + m.paisa)/100, (this.paisa + m.paisa)%100);
        return result;
    }

    Money subtract(Money m)
    {
        if (this.paisa > m.paisa)
        {
            Money result = new Money(this.rupees - m.rupees, this.paisa - m.paisa);
            return result;
        }
        else
        {
            Money result = new Money(this.rupees - m.rupees - 1, this.paisa + 100 - m.paisa);
            return result;
        }
    }
    void display()
    {
        System.out.println("Rs. " + rupees + "." + paisa);
    }
}

