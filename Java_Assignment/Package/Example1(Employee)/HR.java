package p2;

import p1.Employee;

public class HR extends Employee{

	double commission;

	public HR() 
	{
		super();
		this.commission = commission;
	}
	
	public HR(int id,String name,double salary,double commission) 
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
	
	public void display() 
	{
		super.display();
		System.out.println("Commission is " + this.commission);

	}
	
	public double calSal() 
	{
		return salary + commission;
	}
}
