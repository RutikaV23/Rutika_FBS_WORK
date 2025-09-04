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

}//Info end

class Admin 
{
	public static void main(String []args)
	{
		Info a = new Info();
		a.setId(10);
		a.setName("Rutika");
		a.setSalary(30000);
		a.setAllowance(300);
		
		a.display();
		
	}
}