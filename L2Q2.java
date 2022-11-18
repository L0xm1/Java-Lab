public class L2Q2
{
	public static void main(String args[])
	{
		Student2 S1 = new Student2();
		Student2 S2 = new Student2();
		S1.getData("Mohith","Ooty","923329857","Loveboy","25.02.2003");
		S2.getData("Jessica","Chennai","9273523493","Rajsekar","16.06.2003");
		S1.printData();
		S2.printData();
	}
}

class Student2
{
        String name;
        String place;
        String mobnum;
        String Parent;
	String DOB;

        public void printData()
        {
                System.out.println("Name: "+this.name);
                System.out.println("Place: "+this.place);
                System.out.println("Mobile: "+this.mobnum);
                System.out.println("Parent name: "+this.Parent);
		System.out.println("DOB: "+this.DOB);
        }

	public void getData(String name, String place, String mobnum, String Parent, String DOB)
	{
		this.name = name;
		this.place = place;
		this.mobnum = mobnum;
		this.Parent = Parent;
		this.DOB = DOB;
	}
}
