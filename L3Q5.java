import java.util.Scanner;

class Staff
{
    int code;
    String name;

    Staff(int code, String name)
    {
        this.code = code;
        this.name = name;
    }

    void display()
    {
        System.out.println("Code: "+code);
        System.out.println("Name: "+name);
    }
}

class Teacher extends Staff
{
    String subject;
    String publication;

    Teacher(int code, String name, String subject, String publication)
    {
        super(code, name);
        this.subject = subject;
        this.publication = publication;
    }

    void display()
    {
        System.out.println("Code: "+code);
        System.out.println("Name: "+name);
        System.out.println("Subject: "+subject);
        System.out.println("Publication: "+publication);
    }
}

class Officer extends Staff
{
    char grade;

    Officer(int code, String name, char grade)
    {
        super(code, name);
        this.grade = grade;
    }

    void display()
    {
        System.out.println("Code: "+code);
        System.out.println("Name: "+name);
        System.out.println("Grade: "+grade);
    }
}

class Typist extends Staff
{
    int speed;

    Typist(int code, String name, int speed)
    {
        super(code, name);
        this.speed = speed;
    }

    void display()
    {
        System.out.println("Code: "+code);
        System.out.println("Name: "+name);
        System.out.println("Speed: "+speed);
    }
}

class Regular extends Typist
{
    int salary;

    Regular(int code, String name, int speed, int salary)
    {
        super(code, name, speed);
        this.salary = salary;
    }

    void display()
    {
        super.display();
        System.out.println("Salary: "+salary);
    }
}

class Casual extends Typist
{
    int daily_wages;

    Casual(int code, String name, int speed, int daily_wages)
    {
        super(code, name, speed);
        this.daily_wages = daily_wages;
    }

    void display()
    {
        super.display();
        System.out.println("Daily Wages: "+daily_wages);
    }
}

public class L3Q5 
{
    public static void main(String args[])
    {
        Staff database[] = new Staff[10];
        database[0] = new Teacher(1, "A", "Maths", "Oxford");
        database[1] = new Teacher(2, "B", "Physics", "Pearson");
        database[2] = new Teacher(3, "C", "Chemistry", "Oxford");
        database[3] = new Officer(4, "D", 'A');
        database[4] = new Officer(5, "E", 'B');
        database[5] = new Regular(6, "F", 50, 10000);
        database[6] = new Regular(7, "G", 60, 12000);
        database[7] = new Regular(8, "H", 70, 14000);
        database[8] = new Casual(9, "I", 40, 500);
        database[9] = new Casual(10, "J", 45, 600);
        for (int i=0;i<10;i++)
        {
            System.out.println("Employee "+(i+1));
            database[i].display();
            System.out.println("\n");
        }
    }
}