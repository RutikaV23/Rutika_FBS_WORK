package p1;

public class IvalidMarksException extends Exception {

	public String toString() 
	{
		return "Invalid Marks";
	}
}//IvalidMarksException ends here


class Marks 
{
	int marks;

	public Marks(int marks) 
	{
		this.marks = marks;
	}
	
	public void checkMarks() throws IvalidMarksException
	{
		
		    if(marks <= 0 ) 
		    {
		    	throw new  IvalidMarksException();
		    }
			else if(marks <= 100 && marks > 81)
				System.out.println("Distinction");
			else if(marks <= 80 && marks > 61)
				System.out.println("first class");
			else if(marks <= 60 && marks > 41)
				System.out.println("secnd class");
			else if(marks <= 40 && marks > 35)
				System.out.println("pass");
			else if(marks < 35)
				System.out.println("Fail");
			
		
	}//checkMarks ends here
}	


class Test 
{
	public static void main(String []args) 
	{
		Marks m1 = new Marks(0);
		
		try 
		{
			m1.checkMarks();		
		}
		catch(Exception m)
		{
			System.out.println(m);

		}
	}
}