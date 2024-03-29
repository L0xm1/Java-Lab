import java.lang.Thread;
public class L6Q7
{
    public static void main(String args[])
    {
        A a = new A();
        B b = new B();
        C c = new C();
        a.start();
        b.start();
        c.start();
    }
}

class A extends Thread
{
    public void run()
    {
        for (int i=1; i<=5; i++)
        {
            System.out.println("\t From thread A: i="+i);
        }
        System.out.println("Exit from A");
    }
}

class B extends Thread
{
    public void run()
    {
        for (int j=1; j<=5; j++)
        {
            System.out.println("\t From thread B: j="+j);
        }
        System.out.println("Exit from B");
    }
}

class C extends Thread
{
    public void run()
    {
        for (int k=1; k<=5; k++)
        {
            System.out.println("\t From thread C: k="+k);
        }
        System.out.println("Exit from C");
    }
}