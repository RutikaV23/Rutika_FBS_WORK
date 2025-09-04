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
           	//System.out.println(this.day + "/" + this.month + "/" + this.year);
           	System.out.println("Day is " + this.day);
		System.out.println("Month is " + this.month);
		System.out.println("Year is " + this.year);

	}


}//Date1 end

class Test1 
{
	public static void main(String []args)
	{
		Date1 d1 = new Date1();
		Date1 d2 = new Date1();

		d1.setDay(10);
		d1.setMonth(6);
		d1.setYear(2025);
		d1.setDow("Wed");
		

		d2.setDay(14);
		d2.setMonth(6);
		d2.setYear(2025);
		d2.setDow("Wed");

		
		d1.display();
/*
		if(d1.getDay() > d2.getDay())
		{
			System.out.println("d1 is Younger");
		}
		else
		{
			System.out.println("d2 is Younger");
		}
		
*/		
		
	}
}