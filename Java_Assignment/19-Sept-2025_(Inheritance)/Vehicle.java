class Vehicle
{
	int modelNo;
	String color;
    double price;
	
	Vehicle() {//default constructor
		
		this.modelNo = 116070;
		this. color= "RED";
		this.price = 150000;
	}
	
	Vehicle(int modelNo, String color, double price) {
		//Parameterized constructor
		super();
		this.modelNo = modelNo;
		this.color = color;
		this.price = price;
	}


	int getModelNo() {
		return modelNo;
	}

	void setModelNo(int modelNo) {
		this.modelNo = modelNo;
	}

	String getColor() {
		return color;
	}

	void setColor(String color) {
		this.color = color;
	}

	double getPrice() {
		return price;
	}

	void setPrice(double price) {
		this.price = price;
	}

	void display()
	{
           	//System.out.println(this.id + "/" + this.name + "/" + this.marks);
        System.out.println("ModelNo is is " + this.modelNo);
		System.out.println("Color is " + this.color);
		System.out.println("Price is " + this.price);

	}

}//Vehicle end

class Car extends Vehicle
{
	String brand;
	int speed;
	
	
	Car() 
	{//default constructor
		super();
		this.brand = "Creata";
		this.speed = 120;
	}
	
	Car(int modelNo, String color, double price,String brand, int speed)
	{
		//Parameterized constructor
		super(modelNo,color,price);
		this.brand = brand;
		this.speed = speed;
	}


	void display() 
	{
		super.display();
		System.out.println("Brand is " + this.brand);
		System.out.println("Speed is " + this.speed);
	}
	
}//Car end

class Buss extends Vehicle
{
	int passengerCapacity;

	Buss()
	{//default constructor
		super();
		this.passengerCapacity = 50;
	}
	
	Buss(int modelNo, String color, double price,int passengerCapacity) 
	{//Parameterized constructor
		super(modelNo,color,price);
		this.passengerCapacity = passengerCapacity;
	}

	int getPassengerCapacity() {
		return passengerCapacity;
	}

	void setPassengerCapacity(int passengerCapacity) {
		this.passengerCapacity = passengerCapacity;
	}

	void display() 
	{
		super.display();
		System.out.println("Passenger Capacity is " + this.passengerCapacity);
	}
	
}//Bus end


class Test2 
{
	public static void main(String []args)
	{
		
		Vehicle v1 = new Vehicle(1154,"Blue",50000);		
		v1.display();		
		System.out.println();

		Car c1 = new Car(1164,"Black",50000,"Hero",100);
		c1.display();
		System.out.println();
		
		Buss b = new Buss(1178,"Green",400000,30);
		b.display();
		System.out.println();
		
		
	}
}