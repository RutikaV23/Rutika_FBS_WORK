package p2;

import p1.Employee;  

public class Admin extends Employee{

	double allowance;

	public Admin() {
		super();
		this.allowance = allowance;
	}
	
	public Admin(int id,String name,double salary,double allowance) {
		super(id,name,salary);
		this.allowance = allowance;
	}

	double getAllowance() {
		return allowance;
	}

	void setAllowance(double allowance) {
		this.allowance = allowance;
	}
	
	public void display() 
	{
		super.display();
		System.out.println("Allowance is " + this.allowance);

	}
	
	
	public double calSal() 
	{
		return salary + allowance;
	}
}
