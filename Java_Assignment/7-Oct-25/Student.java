import java.util.TreeSet;

class Student implements Comparable <Student>
{
	
	int rollNo;
	int marks;
	String name;
	
	
	public int compareTo(Student s2 ) 
	{
		return this.rollNo - s2.rollNo;
	}
	
	public Student() {
		
		this.rollNo = 101;
		this.marks = 0;
		this.name = "Not define";
	}
	
	public Student(int rollNo, int marks, String name) {
		
		this.rollNo = rollNo;
		this.marks = marks;
		this.name = name;
	}


	int getRollNo() {
		return rollNo;
	}

	void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	int getMarks() {
		return marks;
	}

	void setMarks(int marks) {
		this.marks = marks;
	}

	String getName() {
		return name;
	}

	void setName(String name) {
		this.name = name;
	}
	
	public String toString() {
		return "Student [rollNo=" + rollNo + ", marks=" + marks + ", name=" + name + "]";
	}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		TreeSet<Student>s1 = new TreeSet<Student>(); 
		
		s1.add(new Student(101,450,"akki")); 
		s1.add(new Student(102,120,"Aboli")); 
		s1.add(new Student(103,350,"raju")); 

		System.out.println(s1);
		
		if(s1.contains(new Student(106,450,"akki")))
		{
			System.out.println("found");
		}
		else
		{
			System.out.println(" not found");

		}
		
	
	}

}
