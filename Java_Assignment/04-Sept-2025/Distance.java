class Distance
{

	int feet;
	double inches;
	
       //setter function
	void setFeet(int f)
	{
		this.feet = f;
	}

	void setInches(double i)
	{
		this.inches = i;
	}

        // getter function
	int setFeet()
	{
		return this.feet;
	}

	double setFInches()
	{
		return this.inches;
	}

	void display()
	{
		System.out.println("Feet : " + this.feet);
		System.out.println("Inches : " + this.inches);
	}
}

class Calculate_Distance
{
	public static void main(String []args)
	{
		Distance d = new Distance();
		d.setFeet(10);
		d.setInches(8.5);
		
		d.display();
	}

}