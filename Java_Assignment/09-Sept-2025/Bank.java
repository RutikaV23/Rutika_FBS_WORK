class Student 
{
    int rollno;
    String name;
    double percentage;

    	//constructor
	Student(int rollno, String name, double percentage) 
	{
        this.rollno = rollno;
        this.name = name;
        this.percentage = percentage;
        }

	void setRollno(int r)
    	{
             this.rollno= r;
    	}
	
	void setName(String n)
    	{
             this.name= n;
    	}
	
	void setPercentage(double p)
    	{
             this.percentage= p;
    	}

     	int getRollno()
    	{
       	     return this.rollno;
     	}
	
	String getName()
    	{
       	     return this.name;
     	}
	
	double getPercentage()
    	{
       	     return this.percentage;
     	}
}

class Employee 
{
    int id;
    String name;
    double annualSalary;

   	//constructor
	Employee(int id, String name, double annualSalary) 
	{
        this.id = id;
        this.name = name;
        this.annualSalary = annualSalary;
        }

	void setId(int i)
    	{
             this.id= i;
    	}
	
	void setName(String n)
    	{
             this.name= n;
    	}
	
	void setAnnualSalary(double a)
    	{
             this.annualSalary= a;
    	}

     	int getId()
    	{
       	     return this.id;
     	}
	
	String getName()
    	{
       	     return this.name;
     	}
	
	double getAnnualSalary()
    	{
       	     return this.annualSalary;
     	}

}

class Bank {
    // Loan for Student
    void loan(Student s) {
        if (s.percentage > 80) {
            System.out.println(s.name + " : Loan approved of 2 Lakh");
        } else if (s.percentage >= 60) {
            System.out.println(s.name + " : Loan approved of 1 Lakh");
        } else if (s.percentage >= 40) {
            System.out.println(s.name + " : Loan approved of 50K");
        } else {
            System.out.println(s.name + " : No Loan Approved");
        }
    }

    // Loan for Employee
    void loan(Employee e) {
        if (e.annualSalary >= 1200000) {
            System.out.println(e.name + " : Loan approved of 7 Lakh");
        } else if (e.annualSalary >= 1000000) {
            System.out.println(e.name + " : Loan approved of 6 Lakh");
        } else if (e.annualSalary >= 600000) {
            System.out.println(e.name + " : Loan approved of 5 Lakh");
        } else if (e.annualSalary >= 400000) {
            System.out.println(e.name + " : Loan approved of 3 Lakh");
        } else {
            System.out.println(e.name + " : No Loan Approved");
        }
    }
}

class Test {
    public static void main(String[] args) {
        // Create Student
        Student s1 = new Student(101, "Rutika", 85.0);
        Student s2 = new Student(102, "Riya", 55.0);

        // Create Employee
        Employee e1 = new Employee(201, "Ankit", 600000);
        Employee e2 = new Employee(202, "Karan", 250000);

        // Create Bank object
        Bank bank = new Bank();

        // Check loan approvals
        bank.loan(s1);
        bank.loan(s2);
        bank.loan(e1);
        bank.loan(e2);
    }
}
