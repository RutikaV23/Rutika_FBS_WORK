class Info
{
	int isbn;
	String title;
	String author;
	String publisher;
        double price;

	
	//setter function 
	void setIsbn(int d)
	{
		this.isbn = d;
	}

	void setTitle(String t)
	{
		this.title = t;
	}

	void setAuthor(String a)
	{
		this.author = a;
	}
	
	void setPublisher(String pb)
	{
		this.publisher = pb;
	}
	
	void setPrice(double p)
	{
		this.price = p;
	}

	
	// getters function
	int getIsbn(int d)
	{
		return this.isbn;
	}

	String getTitle(String t)
	{
		return this.title;
	}

	String getAuthor()
	{
		return this.author;
	}
	
	String getPublisher()
	{
		return this.publisher;
	}
	
	double getPrice()
	{
		return this.price;
	}

	void display()
	{
           	System.out.println("Isbn Number is : " + this.isbn + " Title  : " + this.title + " + " Author :  " + this.author + " Publisher : " + this.publisher + " Book Price : " + this.price);
           	
/* 		System.out.println("Id is is " + this.isbn);
		System.out.println("Title is " + this.title);
		System.out.println("Author is " + this.author);
		System.out.println("Publisher is " + this.publisher);
		System.out.println("Price is " + this.price);
*/
	}


	Info()
	{
		System.out.println("This is default constructor");
		this.isbn = 1010;
		this.title = "Chhava";
		this.author = "Shivaji Sawant";
		this.publisher = "hisotypress";
		this.price = 450;

	}


	Info(int d,String t,String a ,String pb,int p)
	{
		System.out.println("This is Parameterize constructor");
		this.isbn = d;
		this.title = t;
		this.author = a;
		this.publisher = pb;
		this.price = p;

	}


}//Info end

class Book 
{
	public static void main(String []args)
	{
		Info b = new Info();
		b.display();

		System.out.println();
		
		Info b1 = new Info(1012,"Mrutyunjay","Shivaji Sawant","Samar",400);
		b1.display();

	}
}