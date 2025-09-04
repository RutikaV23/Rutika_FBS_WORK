class Date1
{
	int day,month,year;
	String dow;                //reference
	
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

}//Date1 end

class Test1 
{
	public static void main(String []args)
	{
		Date1 d1 = new Date1();
		d1.setDay(10);
		d1.setMonth(6);
		d1.setYear(2025);
		d1.setDow("Wed");
		System.out.println("Day : " + d1.day);
		System.out.println("Month : " + d1.month);
		System.out.println("Year : " + d1.year);
		System.out.println("Day of Week : " + d1.dow);
		
	}
}