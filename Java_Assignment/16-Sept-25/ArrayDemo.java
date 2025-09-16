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

class ArrayDemo
{
	public static void main(String [] args)
	{
		int [] arr = new int[5];
		int i;
		for(i=0;i<arr.length;i++)
		{
			arr[3] = 3;
			System.out.println(arr[i]);  //length times zero
					
		}

		Info [] brr = new Info[5];
		//array of references
		//which has null at all the array locations

		for(i=0;i<brr.length;i++)
		{
			System.out.println(brr[i]);  //length times null
					
		}

		//for(i=0;i<brr.length;i++)
		//brr[i].display();
		//this gives NullPointerException

		//what shoud we do
		brr[0] = new Info(); //default
		brr[1] = new Info(101,"Rutika",50000); //parameterised
		
		for(i=0;i<brr.length;i++)
		brr[i].display();
	
	}
}