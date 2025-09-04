class Info
{
	int id,target;
	String name;
        double salary;
	double incentive;	

	//setter or mutators function
	void setId(int d)
	{
		this.id = d;
	}

	void setTarget(int t)
	{
		this.target = t;
	}

	void setName(String n)
	{
		this.name = n;
	}

	void setSalary(double s)
	{
		this.salary = s;
	}
	
	void setIncentive(double i)
	{
		this.incentive = i;
	}

	//getter or Accessor function
	int getId()
	{
		 return this.id;
	}

	int getTarget()
	{
		return this.target;
	}

	String getName()
	{
		return this.name;
	}

	double getSalary()
	{
		return this.salary;
	}
	
	double getIncentive()
	{
		return this.incentive;
	}


         void display()
	{
		//System.out.println(this.id + "/" + this.name + "/" + this.salary + "/ Target is " + this.target + "Incentive is " + this.incentive);
           	
		System.out.println("Id is is " + this.id);
		System.out.println("Name is " + this.name);
		System.out.println("Salary is " + this.salary);
		System.out.println("Target is " + this.target);
		System.out.println("Incentive is " + this.incentive);

	}
}//Info end

class SalesManger
{
	public static void main(String []args)
	{
		Info sal = new Info();
		sal.setId(1);
		sal.setName("Rutika");
		sal.setSalary(50000);
		sal.setTarget(10);
		sal.setIncentive(10000);
		
		sal.display();
		

/*
		System.out.println("Id : " + sal.id);
		System.out.println("Name : " + sal.name);
		System.out.println("Salary : " + sal.salary);
		System.out.println("Target : " + sal.target);
		System.out.println("Incentive: " + sal.incentive);
*/
	}
}