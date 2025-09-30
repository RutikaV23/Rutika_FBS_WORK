package p1;

abstract public class Employee {

	int id;
	String name;
	public double salary;
    
   public Employee()
	{
		System.out.println("This is default constructor");
		this.id = 1;
		this.name = "Rutika";
		this.salary = 45000;
	}

	public Employee(int d,String t,double a)
	{
		System.out.println("This is Parameterize constructor");
		this.id = d;
		this.name = t;
		this.salary = a;
	}
    
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

	
	 public int getId()
	{
		return this.id;
	}

	 public String getName()
	{
		return this.name;
	}

	public double setSalary()
	{
		return this.salary;
	}

	public void display()
	{
           	//System.out.println(this.id + "/" + this.name + "/" + this.marks);
        System.out.println("Id is is " + this.id);
		System.out.println("Name is " + this.name);
		System.out.println("Salary is " + this.salary);
		System.out.println("Calculate Salary is " + calSal());
	}
	
	abstract public double calSal();
//	{
//		return salary;              // when we used abstract word then remove the defination only allow the declearation here
//	}
}
