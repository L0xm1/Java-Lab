import java.util.Scanner;

class A
{
	public int a;
	public int b;
	private int c;
	private int d;
	protected int e;
	protected int f;

	A(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a, b, c, d, e, f");
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		d = sc.nextInt();
		e = sc.nextInt();
		f = sc.nextInt();
	}
	void get(int a,int b, int c, int d, int e, int f)
	{
		this.a = a;
		this.b = b;
		this.c = c;
		this.d = d;
		this.e = e;
		this.f = f;
	}
	A(int a,int b, int c, int d, int e, int f)
	{
		this.a = a;
		this.b = b;
		this.c = c;
		this.d = d;
		this.e = e;
		this.f = f;
	}
	public void print()
	{
		System.out.print(a+"\n"+b+"\n"+c+"\n"+d+"\n"+e+"\n"+f+"\n");
	}

}

public class L2Q5
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		int e = sc.nextInt();
		int f = sc.nextInt();
		A obj = new A();
		obj.get(a,b,c,d,e,f);
		obj.print();
		//Trying to access all data members in the main method
		System.out.print(obj.a+"\n"+obj.b+"\n"+obj.c+"\n"+obj.d+"\n"+obj.e+"\n"+obj.f+"\n");

	}
}