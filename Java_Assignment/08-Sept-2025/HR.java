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

	Info(int d,String n,double s,int c)
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
		Info hr = new Info();		
		hr.display();
			
		System.out.println();
		
		Info hr1 = new Info(1002,"Raju",45000,10000);		
		hr1.display();
	}
}