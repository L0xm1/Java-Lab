import java.util.Scanner;
public class L2Q4
{
	public static void main(String args[])
	{
		Car cars[] = new Car[5];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the details: ");
		for(int i=0;i<5;i++)
		{
			cars[i] = new Car();
			cars[i].edit_info();
		}
		int choice=0,x;
		while (choice!=3)
		{
			System.out.println("1.Display details\n2.Edit details\n3.Exit");
			choice = sc.nextInt();
			if (choice==1)
			{	
				System.out.print("Enter car number: ");
				x = sc.nextInt();
				cars[x-1].display_detail();
			}
			else if (choice==2)
			{
				System.out.print("Enter car number: ");
				x = sc.nextInt();
				cars[x-1].edit_info();
			}
			else
				break;
		}
	}
}

class Car
{
	String model;
	int year;
	String color;
	String fuel_type;

	Car(){}
	Car(String model, int year, String color, String fuel_type)
	{
		this.model = model;
		this.year = year;
		this.color = color;
		this.fuel_type = fuel_type;
	}

	public void display_detail()
	{
		System.out.println("Model: "+model);
		System.out.println("Year: "+year);
		System.out.println("Color: "+color);
		System.out.println("Fuel type: "+fuel_type);
	}

	public void edit_info()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Model: ");
		model = sc.nextLine();
		System.out.print("Year: ");
		year = sc.nextInt();
		sc.nextLine();
		System.out.print("Color: ");
		color = sc.nextLine();
		System.out.print("Fuel type: ");
		fuel_type = sc.nextLine();
	}
}
