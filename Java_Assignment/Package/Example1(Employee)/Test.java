package p3;

import p1.Employee;
import p2.Admin;
import p2.HR;
import p2.SalesManger;

public class Test {
	public static void main(String[] args) {
		
		
		Employee Emp1 ;	                                                  //upcasting                          
		
		Employee [] employee = new Employee [3];
		
		employee[0] = new SalesManger (3,"Mrunmayee",50000,2300,5);             //upcasting 
//		Emp1.display();
		
		employee[1] = new HR(4,"Akki",400000,1200);                           //upcasting
//		Emp1.display();	

		
		employee[2] = new Admin(5,"Mansi",45000,1000);                        //upcasting
//		Emp1.display();		
		
		for(int i=0;i<employee.length;i++) 
		{
			employee[i].display(); //display array employee
			System.out.println();
		}
		
		
		
	}
}
