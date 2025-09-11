class Calculator
{
	void print(int a,int b)
	{
		System.out.println("Result : " + (a+b));
		System.out.println(" void print(int a,int b) ");
	}
	
	void print(double a,double b)
	{
		System.out.println("Result : " + (a+b));
		System.out.println(" void print(double a,double b) ");

	}

	void print(int a,double b)
	{
		System.out.println("Result : " + (a+b));
		System.out.println(" void print(int a,double b) ");

	}

	void print(double a,int b)
	{
		System.out.println("Result : " + (a+b));
		System.out.println(" void print(double a,int b)");

	}
} //end Calculator

class Test
{
	public static void main (String []args)
	{
		Calculator c1 = new Calculator();
		c1.print(12,23);
		c1.print(10.34,23.12);
		c1.print(11,20.3);
		c1.print(2.4,78);
	}
}