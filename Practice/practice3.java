import java.util.Scanner;
public class practice3 
{
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        car c = new car();
        System.out.print("Enter name: ");
        c.name = input.nextLine();
        System.out.print("Enter number: ");
        c.number = input.nextInt();
        System.out.print("Enter price: ");
        c.price = input.nextDouble();
        System.out.print("Enter discount: ");
        c.discount = input.nextDouble();
        c.display();
        System.out.println("Discounted price: " + c.getDiscountedPrice());
    }
}

class motorvehicle
{
    String name;
    int number;
    double price;

    void display()
    {
        System.out.println("Name: " + name);
        System.out.println("Number: " + number);
        System.out.println("Price: " + price);
    }
}

class car extends motorvehicle
{
    double discount;
    void display()
    {
        super.display();
        System.out.println("Discount: " + discount);
    }

    double getDiscount()
    {
        return discount;
    }

    double getDiscountedPrice()
    {
        return price - (price * discount / 100);
    }
}
