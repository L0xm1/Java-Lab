//Testing abstract class and method

abstract class myclass
{
    abstract void mymethod();
}

class myclass2 extends myclass
{
    void mymethod()
    {
        System.out.println("This is mymethod");
    }
}

public class L4Q4 
{
    public static void main(String args[])
    {
        myclass2 m = new myclass2();
        m.mymethod();
    }
}
