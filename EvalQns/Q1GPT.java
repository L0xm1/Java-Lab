public class Q1GPT{
    public static void main(String[] args)
    {
        Saloon customer1 = new Saloon("John Doe", true, "premium", "01/01/2022");
        customer1.display_service();
        customer1.set_service_expense(100.0);
        customer1.set_product_expense(50.0);
        System.out.println("Total expense for customer 1: $" + customer1.calculate_total_expense());
        Saloon customer2 = new Saloon("Jane Smith", false, "", "01/02/2022");
        customer2.display_service();
        customer2.set_service_expense(75.0);
        customer2.set_product_expense(25.0);
        System.out.println("Total expense for customer 2: $" + customer2.calculate_total_expense());
    }
}
class Saloon {
    // data members
    private String customer_name;
    private boolean isMember;
    private String member_type;
    private String date_of_visit;
    private double service_expense;
    private double product_expense;
    
    // static final discounts
    public static final double ServiceDiscount_Premium = 0.2;
    public static final double ServiceDiscount_Gold = 0.15;
    public static final double ServiceDiscount_Silver = 0.1;
    public static final double ProductDiscount_Premium = 0.1;
    public static final double ProductDiscount_Gold = 0.1;
    public static final double ProductDiscount_Silver = 0.1;
    
    // constructor
    public Saloon(String customer_name, boolean isMember, String member_type, String date_of_visit) {
        this.customer_name = customer_name;
        this.isMember = isMember;
        this.member_type = member_type;
        this.date_of_visit = date_of_visit;
    }

    // member methods
    public void getInformation() {
        System.out.println("Customer name: " + customer_name);
        System.out.println("Is member: " + isMember);
        System.out.println("Member type: " + member_type);
        System.out.println("Date of visit: " + date_of_visit);
    }

    public void display_service() {
        System.out.println("Menu of services: ");
        System.out.println("1. Haircuts");
        System.out.println("2. Hair coloring");
        System.out.println("3. Facial");
        System.out.println("4. Makeup");
    }

    public void set_service_expense(double price) {
        this.service_expense = price;
    }

    public void set_product_expense(double price) {
        this.product_expense = price;
    }

    public double get_service_expense() {
        return service_expense;
    }

    public double get_product_expense() {
        return product_expense;
    }

    public double getServiceDiscount_Rate() {
        if (!isMember) {
            return 0.0;
        }
        if (member_type.equalsIgnoreCase("premium")) {
            return ServiceDiscount_Premium;
        }
        else if (member_type.equalsIgnoreCase("gold")) {
            return ServiceDiscount_Gold;
        }
        else if (member_type.equalsIgnoreCase("silver")) {
            return ServiceDiscount_Silver;
        }
        return 0.0;
    }

    public double getProductDiscount_Rate() {
        return ProductDiscount_Premium;
    }

    public double calculate_total_expense() {
        double serviceDiscount = service_expense * getServiceDiscount_Rate();
        double productDiscount = product_expense * getProductDiscount_Rate();
        return service_expense + product_expense - serviceDiscount - productDiscount;
    }
}
