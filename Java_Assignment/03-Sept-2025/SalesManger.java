class Info
{
	int id,target;
	String name;
        double salary;
	double incentive;	

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
		

		System.out.println("Id : " + sal.id);
		System.out.println("Name : " + sal.name);
		System.out.println("Salary : " + sal.salary);
		System.out.println("Target : " + sal.target);
		System.out.println("Incentive: " + sal.incentive);
	}
}