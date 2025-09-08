class Info
{
	int id;
	String name;
        double salary;
	
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

	void display()
	{
           	//System.out.println(this.id + "/" + this.name + "/" + this.marks);
           	System.out.println("Id is is " + this.id);
		System.out.println("Name is " + this.name);
		System.out.println("Salary is " + this.salary);

	}

	
	Info()
	{
		System.out.println("This is default constructor");
		this.id = 1;
		this.name = "Rutika";
		this.salary = 45000;
	}

	Info(int d,String t,double a)
	{
		System.out.println("This is Parameterize constructor");
		this.id = d;
		this.name = t;
		this.salary = a;
	}


}//Info end

class Employee 
{
	public static void main(String []args)
	{
		Info Emp = new Info();		
		Emp.display();

		System.out.println();

		Info Emp1 = new Info(2,"Advika",50000);		
		Emp1.display();		
	}
}