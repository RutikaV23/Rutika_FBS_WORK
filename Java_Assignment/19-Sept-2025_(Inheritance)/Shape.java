
class Shape 
{
	int noSide;
	String shape;
	
	Shape() {//default constructor
		super();
		this.noSide = 0;
		this.shape = "circle";
	}
	
	Shape(int noSide, String shape) {
		super();
		this.noSide = noSide;
		this.shape = shape;
	}

	int getNoSide() {
		return noSide;
	}

	void setNoSide(int noSide) {
		this.noSide = noSide;
	}

	String getShape() {
		return shape;
	}

	void setShape(String shape) {
		this.shape = shape;
	}
	
	void display() 
	{
		System.out.println("No Side " + this.noSide);
		System.out.println("Shape " + this.shape);
	}

}//end shape

class Rectangle extends Shape
{
	int length,breadth;

	Rectangle() {
		super();
		this.length = 2;
		this.breadth = 3;
	}
	
	Rectangle(int noSide, String shape,int length, int breadth) {
		super(noSide,shape);
		this.length = length;
		this.breadth = breadth;
	}

	int getLength() {
		return length;
	}

	void setLength(int length) {
		this.length = length;
	}

	int getBreadth() {
		return breadth;
	}

	void setBreadth(int breadth) {
		this.breadth = breadth;
	}
	
	void display() 
	{
		super.display();
		System.out.println("No Side " + this.length);
		System.out.println("Shape " + this.breadth);
	}
	
}//end Rectangle

class Circle extends Shape
{
	int radius;

	Circle() 
	{
		super();
		this.radius = 5;
	}
	
	Circle(int noSide, String shape,int radius) 
	{
		super(noSide,shape);
		this.radius = radius;
	}

	int getRadius() {
		return radius;
	}

	void setRadius(int radius) {
		this.radius = radius;
	}
	
	void display() 
	{
		super.display();
		System.out.println("Radius " + this.radius);
	}
	
}//ends Circle 

class Square extends Shape
{
	int side;

	Square() {
		super();
		this.side = 4;
	}
	
	Square(int noSide, String shape,int side) {
		super(noSide, shape);
		this.side = side;
	}
	
	void display() 
	{
		super.display();
		System.out.println("No Side " + this.side);
	}
}//ends Square

class Test3
{
	public static void main(String []args) 
	{
		Shape s1 = new Shape(12,"circle");
		s1.display();
		System.out.println();
		
		Rectangle r = new Rectangle(4,"Rectangle",6,7);
		r.display();
		System.out.println();
		
		Circle t1 = new Circle(0,"Circle",7);
		t1.display();
		System.out.println();
		
		Square s2 = new Square(4,"Square",3);
		s2.display();
		System.out.println();
		
	}
}