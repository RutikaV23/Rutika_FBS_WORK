class Info
{
	int distance;
	String name,designtion;	

	void setDistance(int ds)
	{
		this.distance = ds;
	}

	void setDesigntion(String d)
	{
		this.designtion = d;
	}

	void setName(String n)
	{
		this.name = n;
	}

	
	int getDistance()
	{
		return this.distance;
	}

	String getDesigntion()
	{
		return this.designtion;
	}

	String getName()
	{
		return this.name;
	}

	
	void display()
	{
           	//System.out.println(this.Distance + "/" + this.designtion + "/" + this.name);
           	System.out.println("Distance is " + this.distance + " km ");
		System.out.println("Designtion is  " + this.designtion);
		System.out.println("Name is " + this.name);

	}

}//Info end

class Placed_Student
{
	public static void main(String []args)
	{
		Info std = new Info();
		std.setDistance(150);
		std.setName("Shubhra");
		std.setDesigntion("Mumbai");
		
		std.display();

	}
}