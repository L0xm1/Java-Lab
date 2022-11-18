import java.util.Scanner;

public class L5Q2b 
{
    public static void main(String args[])
    {
        Manager mohith = new Manager();
        mohith.getData();
        mohith.displayData();
    }
}

class Member
{
    String name;
    int age;
    String phone;
    String address;
    int salary;

    public void printSalary()
    {
        System.out.println("Salary is: " + salary);
    }

    Member()
    {
        name = "No name";
        age = 0;
        phone = "No phone";
        address = "No address";
        salary = 0;
    }
}

class Employee extends Member
{
    String specialization;
    String department;

    Employee()
    {
        super();
        specialization = "No specialization";
        department = "No department";
    }

    public void getData()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter name: ");
        name = sc.nextLine();
        System.out.print("Enter age: ");
        age = sc.nextInt();
        System.out.print("Enter phone: ");
        phone = sc.nextLine();
        System.out.print("Enter address: ");
        address = sc.nextLine();
        System.out.print("Enter salary: ");
        salary = sc.nextInt();
        System.out.print("Enter specialization: ");
        specialization = sc.nextLine();
        System.out.print("Enter department: ");
        department = sc.nextLine();
    }
    public void displayData()
    {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Phone: " + phone);
        System.out.println("Address: " + address);
        System.out.println("Salary: " + salary);
        System.out.println("Specialization: " + specialization);
        System.out.println("Department: " + department);
    }
}

class Manager extends Member
{
    String specialization;
    String department;

    Manager()
    {
        super();
        specialization = "No specialization";
        department = "No department";
    }

    public void getData()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter name: ");
        name = sc.nextLine();
        System.out.print("Enter age: ");
        age = sc.nextInt();
        System.out.print("Enter phone: ");
        phone = sc.nextLine();
        System.out.print("Enter address: ");
        address = sc.nextLine();
        System.out.print("Enter salary: ");
        salary = sc.nextInt();
        System.out.print("Enter specialization: ");
        specialization = sc.nextLine();
        System.out.print("Enter department: ");
        department = sc.nextLine();
    }
    public void displayData()
    {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Phone: " + phone);
        System.out.println("Address: " + address);
        System.out.println("Salary: " + salary);
        System.out.println("Specialization: " + specialization);
        System.out.println("Department: " + department);
    }
}