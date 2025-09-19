
class Transport 
{
	String transportName;
	String status;
	
	Transport() 
	{//default constuctor
	
		this.transportName = "Auto";
		this.status = "yes";
	}
	
	Transport(String transportName, String status) 
	{//parameterized constuctor
		
		this.transportName = transportName;
		this.status = status;
	}

	String getTransportName() {
		return transportName;
	}

	void setTransportName(String transportName) {
		this.transportName = transportName;
	}

	String getStatus() {
		return status;
	}

	void setStatus(String status) {
		this.status = status;
	}
	
	void display() 
	{
		System.out.println("Transport Name : " + this.transportName);
		System.out.println("Status : " + this.status);
	}
}//end Transport 

class Bus extends Transport 
{
	int pasengerCapacity;
	int speed;
	
	Bus() {
		super();
		this.pasengerCapacity = pasengerCapacity;
		this.speed = speed;
	}
	
	Bus(String transportName,String status,int pasengerCapacity, int speed)
	{
		super(transportName,status);
		this.pasengerCapacity = pasengerCapacity;
		this.speed = speed;
	}

	int getPasengerCapacity() {
		return pasengerCapacity;
	}

	void setPasengerCapacity(int pasengerCapacity) {
		this.pasengerCapacity = pasengerCapacity;
	}

	int getSpeed() {
		return speed;
	}

	void setSpeed(int speed) {
		this.speed = speed;
	}
	
	void display() 
	{
		super.display();
		System.out.println("Speed : " + this.speed);
		System.out.println("Pasenger Capacity : " + this.pasengerCapacity);
	}
}//end Bus

class Airoplane extends Transport 
{
	double ticketPrice;
	int weight;
	
	Airoplane() {
		super();
		this.ticketPrice = 0;
		this.weight = 0;
	}
	
	Airoplane(String transportName,String status,double ticketPrice, int weight) {
		super(transportName,status);
		this.ticketPrice = ticketPrice;
		this.weight = weight;
	}

	double getTicketPrice() {
		return ticketPrice;
	}

	void setTicketPrice(double ticketPrice) {
		this.ticketPrice = ticketPrice;
	}

	int getWeight() {
		return weight;
	}

	void setWeight(int weight) {
		this.weight = weight;
	}
	
	void display() 
	{
		super.display();
		System.out.println("weight : " + this.weight);
		System.out.println("ticketPrice : " + this.ticketPrice);
	}
	
}//end Airoplane

class Train extends Transport 
{
	String trainName;
	int time;
	
	Train() 
	{
		super();
		this.trainName = "0";
		this.time = 0;
	}
	
	Train(String transportName, String status,String trainName, int time) 
	{
		super(transportName,status);
		this.trainName = trainName;
		this.time = time;
	}

	String getTrainName() {
		return trainName;
	}

	void setTrainName(String trainName) {
		this.trainName = trainName;
	}

	int getTime() {
		return time;
	}

	void setTime(int time) {
		this.time = time;
	}
	
	void display() 
	{
		super.display();
		System.out.println("train Name : " + this.trainName);
		System.out.println("time : " + this.time);
	}
	
}//end Train


class Main
{
	public static void main(String args[]) 
	{
		Transport T1 = new Transport("Auto","yes");
		T1.display();
		System.out.println();
		
		Bus b = new Bus("Bus","Yes",50,120);
		b.display();
		System.out.println();
		
		Train t3 = new Train("Train","Yes","Panvel",9);
		t3.display();
		System.out.println();
		
		Airoplane a = new Airoplane("Plane","Yes",2000,250);
		a.display();
		System.out.println();
		

	}
}
