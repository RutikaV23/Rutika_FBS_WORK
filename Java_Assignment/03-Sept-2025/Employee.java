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


}//Info end

class Employee 
{
	public static void main(String []args)
	{
		Info Emp = new Info();
		Emp.setId(10);
		Emp.setName("Rutika");
		Emp.setSalary(30000);

		System.out.println("Id : " + Emp.id);
		System.out.println("Name : " + Emp.name);
		System.out.println("Salary : " + Emp.salary);
		
	}
}