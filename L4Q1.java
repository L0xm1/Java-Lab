public class L4Q1 
{
    public static void main(String args[])
    {
        Child c = new Child();
        Parent p = new Child();
        c.print();
        p.print();
    }
}

class Parent
{
    public void print()
    {
        System.out.println("Parent");
    }
}

class Child extends Parent
{
    public void print()
    {
        System.out.println("Child");
    }
}