
 abstract class Employee
{
	int id;
	String name;
    double salary;
    
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
		System.out.println("Calculate Salary is " + calSal());
	}
	
	abstract double calSal() ;
//	{
//		return salary;              // when we used abstract word then remove the defination only allow the declearation here
//	}

	
	
}//Employee end

class SalesManger extends Employee
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
		System.out.println("Calculate Salary is " + calSal());

	}
	
	double calSal() 
	{
		return salary + incentive;
	}
}

class HR extends Employee
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
	
	double calSal() 
	{
		return salary + commission;
	}
	
}

class Admin extends Employee
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
	
	double calSal() 
	{
		return salary + allowance;
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
		
		Employee Emp1 ;	                        //upcasting                          
		
		Emp1 = new SalesManger (3,"Mrunmayee",50000,2300,5);             //upcasting 
		Emp1.display();
		
		System.out.println();
		
		Emp1 = new HR(4,"Akki",400000,1200);                           //upcasting
		Emp1.display();	
		System.out.println();
		
		
		
		Emp1 = new Admin(5,"Mansi",45000,1000);                        //upcasting
		Emp1.display();		
		System.out.println();
		
		Emp1 = new AreaSalesManger(6,"Raju",55000,123,100,450);         //upcasting
		Emp1.display();	
		System.out.println();
		

	}
	
}	

