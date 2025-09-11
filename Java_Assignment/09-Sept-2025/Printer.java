class Printer
{
	void print(int a)
	{
		System.out.println(a);
		System.out.println(" void print(int a) ");
	}
	
	void print(char a)
	{
		System.out.println(a);
		System.out.println(" void print(char a) ");

	}

	void print(String a)
	{
		System.out.println(a);
		System.out.println(" void print(String a) ");

	}

}// end Printer


class Test
{
	public static void main (String []args)
	{
		Printer p1 = new Printer();
		p1.print('R');
		p1.print("Rutika");
		p1.print(23);
	}
}