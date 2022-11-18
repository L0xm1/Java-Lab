import java.util.Scanner;
public class L3Q2
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		Student sarray[] = new Student[10];
		int choice=0;
		String temp_name;
		int temp_age;
		String temp_addr;
		for (int j=0;j<10;j++)
		{
			sarray[j] = new Student();
		}
		while (choice!=4)
		{
			System.out.println("1.Set info (without address)\n2.Set info (with address)\n3.Print info\n4.Exit");
			System.out.print("Enter your choice: ");
			choice = sc.nextInt();
			sc.nextLine();
			for (int i=0;i<10;i++)
			{
				switch(choice)
				{
					case 1:
						System.out.print("Enter name: ");
						temp_name = sc.nextLine();
						System.out.print("Enter age: ");
						temp_age = sc.nextInt();
						sc.nextLine();
						sarray[i].setInfo(temp_name,temp_age);
						break;
					case 2:
						System.out.print("Enter name: ");
						temp_name = sc.nextLine();
						System.out.print("Enter age: ");
						temp_age = sc.nextInt();
						sc.nextLine();
						System.out.print("Enter address: ");
						temp_addr = sc.nextLine();
						sarray[i].setInfo(temp_name,temp_age,temp_addr);
						break;
					case 3:
						sarray[i].printInfo();
						break;
					default:
						break;
				}
			}
		}
	}
}

class Student
{
	public String name;
	public int age;
	public String address;

	Student()
	{
		name = new String("unknown");
		age = 0;
		address = new String("not available");
	}

	public void setInfo(String name, int age)
	{
		this.name = name;
		this.age = age;
	}

	public void setInfo(String name, int age, String address)
	{
		this.name = name;
		this.age = age;
		this.address = address;
	}

	public void printInfo()
	{
		System.out.println("Name: "+name);
		System.out.println("Age: "+age);
		System.out.println("Address: "+address);
	}
}
