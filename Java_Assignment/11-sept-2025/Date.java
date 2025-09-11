import java.util.Scanner;
class Date1
{
	int day,month,year;
	String dow;                
	
	void setDay(int d)
	{
		this.day = d;
	}

	void setMonth(int m)
	{
		this.month = m;
	}

	void setYear(int y)
	{
		this.year = y;
	}

	void setDow(String str)
	{
		this.dow = str;
	}

	
	int getDay()
	{
		return this.day;
	}

	int getMonth()
	{
		return this.month;
	}

	int getYear()
	{
		return this.year;
	}

	String getDow()
	{
		return this.dow;
	}
	
	void display()
	{
           	//System.out.println(this.day + "/" + this.month + "/" + this.year + "Day of the Weak is" + this.dow);
           	System.out.println("Day is " + this.day);
		System.out.println("Month is " + this.month);
		System.out.println("Year is " + this.year);
		System.out.println("Day of the Weak is " + this.dow);


	}

	Date1()
	{
		System.out.println("This is default constructor");
		this.day = 8;
		this.month = 9;
		this.year = 2025;
		this.dow = "Thursdya";

	}

	Date1(int d,int m,int y ,String s)
	{
		System.out.println("This is Parameterize constructor");
		this.day = d;
		this.month = m;
		this.year = y;
		this.dow = s;
		
	}


}//Date1 end

class Test1 
{
	public static void main(String []args)
	{
		
		Scanner sc = new Scanner(System.in);
		Date1 d1 ;
		d1 =  new Date1();
	
		System.out.println("Enter day : ");
		String e = sc.nextLine();

		System.out.println("Enter date number : ");
		int a = sc.nextInt();

		System.out.println("Enter month number: ");
		int b = sc.nextInt();

		System.out.println("Enter year");
		int c = sc.nextInt();


		Date1 d2;
		d2 = new Date1(a,b,c,e); 
		d1.display();
		d2.display();		
		
		
	}
}