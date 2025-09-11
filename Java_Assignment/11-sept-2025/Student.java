import java.util.Scanner;
class Info
{
	int rollNo,marks;
	String name;	

	void setRollNo(int r)
	{
		this.rollNo = r;
	}

	void setMarks(int m)
	{
		this.marks = m;
	}

	void setName(String n)
	{
		this.name = n;
	}

	
	int getRollNo()
	{
		return this.rollNo;
	}

	int getMarks()
	{
		return this.marks;
	}

	String getName()
	{
		return this.name;
	}

	
	void display()
	{
           	//System.out.println(this.rollno + "/" + this.marks + "/" + this.name);
           	System.out.println("RollNo is " + this.rollNo);
		System.out.println("Name is " + this.name);
		System.out.println("Marks is " + this.marks);

	}

  	
	Info()
	{
		System.out.println("This is default constructor");
		this.rollNo = 40;
		this.name = "Rutika";
		this.marks = 450;
	}

	Info(int d,String t,int a)
	{
		System.out.println("This is Parameterize constructor");
		this.rollNo = d;
		this.name = t;
		this.marks = a;
	}


}//Info end

class Student
{
	public static void main(String []args)
	{

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter name : ");
		String a = sc.nextLine();

		System.out.println("Enter id: ");
		int b = sc.nextInt();

		System.out.println("Enter marks: ");
		int c = sc.nextInt();

		Info std = new Info();	
		std.display();

		System.out.println();

		Info std1 = new Info(b,a,c);
		std1.display();
	}
}