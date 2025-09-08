class Info
{
	int id;
	String name;
        double salary;
	double allowance;
	
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
	
	void setAllowance(double c)
	{
		this.allowance = c;
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

	double getSalary()
	{
		return this.salary;
	}
	
	double getAllowance()
	{
		return this.allowance;
	}

	void display()
	{
           	//System.out.println(this.id + "/" + this.name + "/" + this.marks);
           	System.out.println("Id is is " + this.id);
		System.out.println("Name is " + this.name);
		System.out.println("Salary is " + this.salary);
		System.out.println("Allowance is " + this.allowance);

	}

	Info()
	{
		System.out.println("This is default constructor");
		this.id = 101;
		this.name = "Rutika";
		this.salary = 50000;
		this.allowance = 10000;

	}


	Info(int d,String n,double s ,double a)
	{
		System.out.println("This is Parameterize constructor");
		this.id = d;
		this.name = n;
		this.salary = s;
		this.allowance = a;
		
	}


}//Info end

class Admin 
{
	public static void main(String []args)
	{
		Info a = new Info();
		a.display();
		
		System.out.println();

		Info a1 = new Info(102,"Advika",55000,10000);
		a1.display();		
	}
}