import java.io.DataOutputStream;
import java.io.*;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class FileDemo 
{
	public static void main(String []args) 
	{
		try 
		{
			FileOutputStream fos = new FileOutputStream("D://13thoct//Data.txt");
			DataOutputStream dos = new DataOutputStream(fos);
			ObjectOutputStream oos = new ObjectOutputStream(dos);
			oos.writeObject(new Student(1,"raju",10));
			System.out.println("Written Successfully");
		}
		
		catch(FileNotFoundException e) 
		{
			e.printStackTrace();
		}
		catch(IOException e) 
		{
			e.printStackTrace();
		}
		
	}//main ends here

	
	public static void main1(String []args) 
	{
		try 
		{
			FileInputStream fis = new FileInputStream("D://13thoct//Data.txt");
			DataInputStream dis = new DataInputStream(fis);
			ObjectInputStream ois = new ObjectInputStream(dis);
			Student s1 = (Student)ois.readObject();
			System.out.println(s1);
		}
		catch(IOException e) 
		{
			e.printStackTrace();
		}
		
		catch(ClassNotFoundException e) 
		{
			e.printStackTrace();
		}
	}
}
