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
           	System.out.println("Id is is " + this.id);
		System.out.println("Name is " + this.name);
		System.out.println("Salary is " + this.salary);
		System.out.println("Salary is " + this.commission);

	}

}//Info end

class HR 
{
	public static void main(String []args)
	{
		Info hr = new Info();
		hr.setId(10);
		hr.setName("Rutika");
		hr.setSalary(30000);
		
		hr.display();

/*		
		System.out.println("Id : " + hr.id);
		System.out.println("Name : " + hr.name);
		System.out.println("Salary : " + hr.salary);
*/		
	}
}