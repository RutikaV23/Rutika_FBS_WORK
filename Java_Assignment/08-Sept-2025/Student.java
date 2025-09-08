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
		Info std = new Info();	
		std.display();

		System.out.println();

		Info std1 = new Info(12,"Mansi",500);
		std1.display();
	}
}