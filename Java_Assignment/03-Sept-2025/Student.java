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



}//Info end

class Student
{
	public static void main(String []args)
	{
		Info std = new Info();
		std.setRollNo(1);
		std.setName("Rutika");
		std.setMarks(500);
		
		System.out.println("Id : " + std.rollNo);
		System.out.println("Name : " + std.name);
		System.out.println("Marks : " + std.marks);
	}
}