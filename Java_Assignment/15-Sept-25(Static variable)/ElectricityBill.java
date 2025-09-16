class ElectricityBill
{
	int b_id,unit;
	String name;
	static double ratePerUnit;

	static 
	{
  		// set default value of ratePerUnit
		ratePerUnit = 8.5;
	}

	//default constructor
	ElectricityBill()
	{
		this.b_id = 101;
  		this.unit = 12;
		this.name = "Mansi";
	       // static varible not declear here becoz it not allow here 
	}

	//paramenterise constructor
	ElectricityBill(int i,int u,String n)
	{
		this.b_id = i;
  		this.unit = u;
		this.name = n;
	}

	//setters
	void setId(int b_id)
	{
		this.b_id = b_id;
	}

	void setUnit(int unit)
	{
		this.unit = unit;
	}

	void setName(String name)
	{
		this.name = name;
	}

	//static function
	static void setRatePerUnit(double d)
	{
		ratePerUnit = d;
	}

	//getters
	int getId()
	{
		return this.b_id;
	}

	int getUnit()
	{
		return this.unit;
	}

	String getName(String name)
	{
		return this.name ;
	}

	void display()
	{
		System.out.println("Id : " + this.b_id);
		System.out.println("Units"+ this.unit);
		System.out.println("Name "+ this.name);
		System.out.println("RatePerUnit" + this.ratePerUnit);

	}

	void calculate(ElectricityBill  e)
	{
		double bill = e.getUnit() * ElectricityBill.ratePerUnit;
		System.out.println("Bill : " + bill);
		
	}	
}
	
class Test
{
	public static void main(String args[])
	{
		ElectricityBill e1 = new ElectricityBill(1,6,"Akki");
		e1.display();
		e1.calculate(e1);
		System.out.println();

		ElectricityBill e2 = new ElectricityBill(2,8,"Rutika");
		e2.display();
		e2.calculate(e2);
		System.out.println();

		ElectricityBill e3 = new ElectricityBill(3,9,"Raju");
		e3.display();
		e3.calculate(e3);
		System.out.println();

		System.out.println("change the value by using static function");
		ElectricityBill.setRatePerUnit(9);
		e1.display();System.out.println();
		e2.display();System.out.println();
		e3.display();System.out.println();
		
	}
}
