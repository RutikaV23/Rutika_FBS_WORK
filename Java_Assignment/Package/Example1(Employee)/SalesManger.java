package p2;

import p1.Employee;

public class SalesManger extends Employee {

	double incentive;
	int target;
	public SalesManger() {
		super();
		this.incentive = incentive;
		this.target = target;
	}
	
	public SalesManger(int id,String name,double salary,double incentive, int target) {
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
	
	public void display() 
	{
		super.display();
		System.out.println("Incentive is " + this.incentive);
		System.out.println("Target is " + this.target);
		System.out.println("Calculate Salary is " + calSal());

	}
	
	public double calSal() 
	{
		return salary + incentive;
	}
}
