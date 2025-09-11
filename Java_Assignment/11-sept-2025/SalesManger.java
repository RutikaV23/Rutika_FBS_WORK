import java.util.Scanner;
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
	
	Info()
	{
		System.out.println("This is default constructor");
		this.id = 1;
		this.name = "Raju";
		this.salary = 45000;
		this.target = 7;
		this.incentive = 1200;

	}

	Info(int d,String n,double s,int t,double i)
	{
		System.out.println("This is Parameterize constructor");
		this.id = d;
		this.name = n;
		this.salary = s;
		this.target = t;
		this.incentive = i;
	}

}//Info end

class SalesManger
{
	public static void main(String []args)
	{

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Employee name : ");
		String a = sc.nextLine();

		System.out.println("Enter id: ");
		int b = sc.nextInt();

		System.out.println("Enter Salary: ");
		int s = sc.nextInt();
	
		System.out.println("Enter Target: ");
		int t = sc.nextInt();

		System.out.println("Enter Incentive: ");
		int i = sc.nextInt();

		Info sal = new Info();
		sal.display();

		System.out.println();
		
		Info sal1 = new Info(b,a,s,t,i);
		sal1.display();

	}
}