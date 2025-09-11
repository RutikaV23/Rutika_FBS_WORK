import java.util.Scanner;
class Info
{
	int id;
	String name;
        double salary;
	double commission;
	
	//setter function 
	void setId(int d)
	{
		this.id = d;
	}

	void setName(String n)
	{
		this.name = n;
	}

	void setSalary(double s)
	{
		this.salary = s;
	}
	
	void setCommission(double c)
	{
		this.commission = c;
	}

	
	// getters function
	int getId()
	{
		return this.id;
	}

	String getName()
	{
		return this.name;
	}

	double setSalary()
	{
		return this.salary;
	}
	
	double setCommission()
	{
		return this.commission;
	}

	void display()
	{
           	//System.out.println(this.id + "/" + this.name + "/" + this.marks);
		System.out.println();
           	System.out.println("Id is is " + this.id);
		System.out.println("Name is " + this.name);
		System.out.println("Salary is " + this.salary);
		System.out.println("Commission is " + this.commission);

	}

	Info()
	{
		System.out.println("This is default constructor");
		this.id = 1001;
		this.name = "Mansi";
		this.salary = 34000;
		this.commission = 12000;	
	}

	Info(int d,String n,double s,double c)
	{
		System.out.println("This is Parameterize constructor");
		this.id = d;
		this.name = n;
		this.salary = s;
		this.commission = c;
	}

}//Info end

class HR 
{
	public static void main(String []args)
	{

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter name : ");
		String e = sc.nextLine();

		System.out.println("Enter id : ");
		int a = sc.nextInt();

		System.out.println("Enter salary: ");
		double b = sc.nextInt();

		System.out.println("Enter commission");
		double c = sc.nextInt();

		Info hr = new Info();		
					
		Info hr1 = new Info(a,e,b,c);		
		hr.display();
		hr1.display();
	}
}