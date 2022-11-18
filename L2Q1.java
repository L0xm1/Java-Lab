public class L2Q1
{
	public static void main(String args[])
	{
		Student S1 = new Student();
		Student S2 = new Student();
		S1.name = "Mohith";
		S1.place = "Ooty";
		S1.mobnum = "97429834197";
		S1.age = 19;
		S2.name = "Jessica";
		S2.place = "Chennai";
		S2.mobnum = "293785213487";
		S2.age = 18;
		S1.printData();
		S2.printData();
	}
}

class Student
{
	String name;
	String place;
	String mobnum;
	int age;
	public Student(){}

	public void printData()
	{
		System.out.println("Name: "+this.name);
		System.out.println("Place: "+this.place);
		System.out.println("Mobile: "+this.mobnum);
		System.out.println("Age: "+this.age);
	}
}
