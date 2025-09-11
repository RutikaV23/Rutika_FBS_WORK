import java.util.Scanner;
class Info
{
	int distance;
	String name,designtion;	

	void setDistance(int ds)
	{
		this.distance = ds;
	}

	void setDesigntion(String d)
	{
		this.designtion = d;
	}

	void setName(String n)
	{
		this.name = n;
	}

	
	int getDistance()
	{
		return this.distance;
	}

	String getDesigntion()
	{
		return this.designtion;
	}

	String getName()
	{
		return this.name;
	}

	
	void display()
	{
           	//System.out.println(this.Distance + "/" + this.designtion + "/" + this.name);
           	System.out.println("Distance is " + this.distance + " km ");
		System.out.println("Name is " + this.name);
		System.out.println("Designtion is  " + this.designtion);

	}

	Info()
	{
		System.out.println("This is default constructor");
	 	this.distance = 450;
		this.name = "Akki";
		this.designtion = "Goa";
	}

	Info(int d,String n,String l)
	{
		System.out.println("This is Parameterize constructor");
		this.distance = d;
		this.name = n;
		this.designtion = l;
	}

}//Info end

class Placed_Student
{
	public static void main(String []args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter name : ");
		String a = sc.nextLine();

		System.out.println("Enter city : ");
		String b = sc.nextLine();

		System.out.println("Enter id: ");
		int c = sc.nextInt();

		Info std = new Info();
		std.display();

		System.out.println();

		Info std1 = new Info(c,a,b);
		std1.display();		

	}
}