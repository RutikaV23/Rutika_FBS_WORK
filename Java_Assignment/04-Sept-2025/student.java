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
		System.out.println("Marks is " + this.marks);
		System.out.println("Name is " + this.name);

	}

}//Info end

class Student
{
	public static void main(String []args)
	{
		Info std = new Info();
		std.setRollNo(1);
		std.setName("Rutika");
		std.setMarks(500);
		
		std.display();

/*	
	System.out.println("Id : " + std.rollNo);
		System.out.println("Name : " + std.name);
		System.out.println("Marks : " + std.marks);
*/
	}
}