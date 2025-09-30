
public class ExceptionTest 
{
	public static void main(String[] args) 
	{
		int a = 10;
		int b = 0;
		int c;
		
		try 
		{
			String fname = args[0];
			String lname = args[1];
			System.out.println("Name is " + fname + " " + lname);
			
			c = a/b;
			
			System.out.println("Answer is "+ c);
		}
		
		catch(ArithmeticException ae)
		{
			System.out.println("please do not provide second value zero");
		}
		
		catch(ArrayIndexOutOfBoundsException ar)
		{
			System.out.println("please provide at least two arguments from the consle");
		}
		
		catch(Exception e)
		{
			System.out.println("Some problem occured");
		}
	}
}
