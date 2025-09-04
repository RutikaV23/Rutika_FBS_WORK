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

}//Info end

class Employee 
{
	public static void main(String []args)
	{
		Info Emp = new Info();
		Emp.setId(10);
		Emp.setName("Rutika");
		Emp.setSalary(30000);
		
		Emp.display();

/*		
		System.out.println("Id : " + Emp.id);
		System.out.println("Name : " + Emp.name);
		System.out.println("Salary : " + Emp.salary);
*/		
	}
}