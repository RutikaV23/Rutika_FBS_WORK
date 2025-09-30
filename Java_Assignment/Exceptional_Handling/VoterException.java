package p1;

public class VoterException extends Exception{

	public String toString() 
	{
		return "Invalid age";
	}

}

class Voter
{
	int age;

	Voter(int age) {
		this.age = age;
	}
	
	public void validate() {
		try 
		{
			if(this.age<18) 
			{
				throw new VoterException();
			}
			else 
			{
				System.out.println("Yes You are eligible to vote");
			}
		}
		
		catch (Exception ve) {
			// TODO: handle exception
				System.out.println(ve);
			}
		}//validate ends here

}//Voter ends here 

class TestException 
{
	public static void main(String []args) 
	{
		Voter v1 = new Voter(24);
		v1.validate();
	}
}
