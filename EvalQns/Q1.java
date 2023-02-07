import java.util.Scanner;
public class Q1
{
    public static void main(String args[])
    {

    }    
}

class Date
{
    int day;
    int month;
    int year;
    Date(int day, int month, int year)
    {
        this.day = day;
        this.month = month;
        this.year = year;
    }
    public void displayDate()
    {
        System.out.println(day + "/" + month + "/" + year);
    }
}

class Saloon
{
    String customer_name;
    boolean member;
    String member_type;
    Date date_of_visit;
    double service_expense;
    double product_expense;

    static final double servicediscount_premium = 0.2;
    static final double servicediscount_gold = 0.15;
    static final double servicediscount_silver = 0.1;
    static final double productdiscount_premium = 0.1;
    static final double productdiscount_gold = 0.1;
    static final double productdiscount_silver = 0.1;

    Saloon()
    {
        customer_name = "";
        member = false;
        member_type = "";
        date_of_visit = new Date(0, 0, 0);
        service_expense = 0;
        product_expense = 0;
    }
    Saloon(String customer_name, boolean member, String member_type, Date date_of_visit, double service_expense, double product_expense)
    {
        this.customer_name = customer_name;
        this.member = member;
        this.member_type = member_type;
        this.date_of_visit = date_of_visit;
        this.service_expense = service_expense;
        this.product_expense = product_expense;
    }

    public void getInformation()
    {
        
    }

    public void display_service()
    {
        //Menu driven service selection such as haircuts, hair coloring, facial, makeup, manicure, pedicure, etc.

    }

    public void set_service_expense()
    {

    }

    public void set_product_expense()
    {

    }

    public double get_service_expense()
    {
        return service_expense;
    }

    public double get_product_expense()
    {
        return product_expense;
    }

    public double get_serviceDiscount_Rate()
    {
        if(member_type.equals("Premium"))
            return servicediscount_premium;
        else if(member_type.equals("Gold"))
            return servicediscount_gold;
        else if(member_type.equals("Silver"))
            return servicediscount_silver;
        else
            return 0;
    }

    public double get_ProductDiscount_Rate()
    {
        if(member_type.equals("Premium"))
            return productdiscount_premium;
        else if(member_type.equals("Gold"))
            return productdiscount_gold;
        else if(member_type.equals("Silver"))
            return productdiscount_silver;
        else
            return 0;
    }

    public double calculate_total_expense()
    {
        return service_expense + product_expense;
    }
}