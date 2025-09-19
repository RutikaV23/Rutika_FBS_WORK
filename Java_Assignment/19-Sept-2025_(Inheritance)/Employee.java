class Employee
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

	
	Employee()
	{
		System.out.println("This is default constructor");
		this.id = 1;
		this.name = "Rutika";
		this.salary = 45000;
	}

	Employee(int d,String t,double a)
	{
		System.out.println("This is Parameterize constructor");
		this.id = d;
		this.name = t;
		this.salary = a;
	}


}//Employee end

class SalesManger extends Employee1
{
	double incentive;
	int target;
	SalesManger() {
		super();
		this.incentive = incentive;
		this.target = target;
	}
	
	SalesManger(int id,String name,double salary,double incentive, int target) {
		super(id,name,salary);
		this.incentive = incentive;
		this.target = target;
	}

	double getIncentive() {
		return incentive;
	}

	void setIncentive(double incentive) {
		this.incentive = incentive;
	}

	int getTarget() {
		return target;
	}

	void setTarget(int target) {
		this.target = target;
	}
	
	void display() 
	{
		super.display();
		System.out.println("Incentive is " + this.incentive);
		System.out.println("Target is " + this.target);
	}
	
}

class HR extends Employee1
{
	double commission;

	HR() 
	{
		super();
		this.commission = commission;
	}
	
	HR(int id,String name,double salary,double commission) 
	{
		super(id,name,salary);
		this.commission = commission;
	}

	double getCommission() {
		return commission;
	}

	void setCommission(double commission) {
		this.commission = commission;
	}
	
	void display() 
	{
		super.display();
		System.out.println("Commission is " + this.commission);
	}
	
}

class Admin extends Employee1
{
	double allowance;

	Admin(double allowance) {
		super();
		this.allowance = allowance;
	}
	
	Admin(int id,String name,double salary,double allowance) {
		super(id,name,salary);
		this.allowance = allowance;
	}

	double getAllowance() {
		return allowance;
	}

	void setAllowance(double allowance) {
		this.allowance = allowance;
	}
	
	void display() 
	{
		super.display();
		System.out.println("Allowance is " + this.allowance);
	}
}

class AreaSalesManger extends SalesManger
{
	double areaName ;

	AreaSalesManger() {
		super();
		this.areaName = areaName;
	}
	
	AreaSalesManger(int id,String name,double salary,double incentive, int target,double areaName) {
		super(id,name,salary,incentive,target);
		this.areaName = areaName;
	}

	double getAreaName() {
		return areaName;
	}

	void setAreaName(double areaName) {
		this.areaName = areaName;
	}
	
	void display() 
	{
		super.display();
		System.out.println("Area is " + this.areaName);
	}
	
}
class Test1 
{
	public static void main(String []args)
	{
		
		Employee1 Emp1 = new Employee1(2,"Advika",50000);		
		Emp1.display();		
		System.out.println();

		SalesManger  s = new SalesManger (3,"Mrunmayee",50000,2300,5);
		s.display();
		System.out.println();
		
		HR h = new HR(4,"Akki",400000,1200);
		h.display();
		System.out.println();
		
		Admin a = new Admin(5,"Mansi",45000,1000);
		a.display();
		System.out.println();
		
		AreaSalesManger as = new AreaSalesManger(6,"Raju",55000,123,100,450);
		as.display();
		System.out.println();
	}
}