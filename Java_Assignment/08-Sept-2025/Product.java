class Info
{
	int id;
	String name;
        int quantity;
	double price;
	
	//setter function 
	void setId(int d)
	{
		this.id = d;
	}

	void setName(String n)
	{
		this.name = n;
	}

	void setQuantity(int q)
	{
		this.quantity = q;
	}
	
	void setPrice(double pr)
	{
		this.price = pr;
	}

	
	// getters function
	int getId()
	{
		return this.id;
	}

	String getName()
	{
		return this.name;
	}

	int getQuantity()
	{
		return this.quantity;
	}
	
	double getPrice()
	{
		return this.price;
	}

	void display()
	{
           	//System.out.println(" The Id :  + " this.id + "Name:  " + this.name + " Quantity of Product " + this.quantity + " Price " + this.price);
           	System.out.println("Id is is :" + this.id);
		System.out.println("Name is :" + this.name);
		System.out.println("Quantity is :" + this.quantity);
		System.out.println("Price is :" + this.price);

	}

	Info()
	{
		System.out.println("This is default constructor");
		this.id = 1210;
		this.name = "Bottle";
		this.quantity = 3;
		this.price = 200;
	}

	Info(int d,String n,int q,int p)
	{
		System.out.println("This is Parameterize constructor");
		this.id = d;
		this.name = n;
		this.quantity = q;
		this.price = p;

	}	

}//Info end

class Product
{
	public static void main(String []args)
	{
		Info p = new Info();
		p.display();

		System.out.println();
		
		Info p1 = new Info(1213,"Pen",5,300);
		p1.display();

	}
}