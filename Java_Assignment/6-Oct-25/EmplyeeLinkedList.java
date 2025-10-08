package list;

import java.util.*;
import p1.Employee;
import p2.Admin;
import p2.HR;
import p2.SalesManger;

public class EmplyeeLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList employee = new LinkedList();
		
		employee.add(new Employee(101,"rutika",45000)); 
		employee.add(new Admin(101,"rutika",45000,670));
		employee.add(new HR(101,"rutika",45000,350));
		employee.add(new SalesManger(101,"rutika",45000,230,4));
		
		System.out.println(employee);
	}

}
