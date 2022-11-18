import java.util.Scanner;

class Number
{
    public int a;
    public int b;

    Number(){
        this.a = 0;
        this.b = 0;
    }
    Number(int a, int b){
        this.a = a;
        this.b = b;
    }
    Number(Number obj){
        this.a = obj.a;
        this.b = obj.b;
    }
    public void sum(){
        System.out.println("Sum = "+(a+b));
    }
    public void diff(){
        System.out.println("Difference = "+(a-b));
    }
    public void product()
    {
        System.out.println("Product = "+(a*b));
    }
}

public class L2Q6 {
    public static void main(String args[])
    {
        Number obj = new Number(5,10);
        obj.sum();
        obj.diff();
        obj.product();
    }
}
