class Triangle
{
    double base, height;
   
    Triangle()
    {
            this.base= 3;
            this.height= 5;
    }

    Triangle(double a, double b)
    {
            this.base= a;
            this.height= b;
    }
  
    void setbase(double a)
    {
           this.base= a;
    }
    void setheight(double b)
    {
             this.height= b;
    }

    double getbase()
    {
            return this.base;
     }
     double getheight()
     {
             return this.height;
     }

     void display()
    {
   
            double c= 0.5 * base * height;
            //System.out.println("Area of Triangle is: "+c);
		System.out.println("Base: "+ this.base);
	        System.out.println("Height: "+ this.height);

     }

}// end Triangle

class Rectangle
{
      double length, breadth;
 
     Rectangle()
     {
            this.length = 2;
            this.breadth = 3;
     }  

     Rectangle(double l, double b)
     {
            this.length = l;
            this.breadth = b;
     }

      void setlength(double length)
      {
             this.length = length;
      }
      void setbreadth(double breadth)
      {
             this.breadth= breadth;
      }

      double getlength()
      {
           return this.length;
      }

      double getbreadth()
      {
           return this.breadth;
      }

     
     void display()
     {
              //double d= length *breadth;
              //System.out.println("Area of Rectangle is: "+d);
		System.out.println("length: "+ this.length);
	        System.out.println("breadth: "+ this.breadth);


     }
}//end Rectangle

class Circle
{
   double radius;
  
   Circle()
   {
          this.radius= 4;
   }


   Circle(double r)
   {
          this.radius= r;
   }

   void setradius(double r)
   {
           this.radius= r;
   }
   double getradius()
   {
           return this.radius;
   }
   void display()
   {
           //double area = 3.14 * radius * radius;
           //System.out.println("Area of Circle is: "+area);
	   System.out.println("Radius: "+ this.radius);
   }


}//end Circle


class Shape
{
   void area(Triangle t)
   {
          double area= 0.5 * t.getbase() * t.getheight();
	  System.out.println("Area of Circle is: "+ area);
	
   }
   void area(Rectangle r)
   {
            double d= r.getlength() * r.getbreadth();
            System.out.println("Area of Rectangle is: "+d);
	    //System.out.println("void area(Rectangle r)");	
   }
   void area(Circle c)
   {
               double d = 3.14 * c.getradius() * c.getradius();
              System.out.println("Area of Circle is: "+ d);
   }

}//end Shape

class AreaOfShape
{
  public static void main(String[] args)
   {
     Shape s1 = new Shape();
    
     Triangle T1= new Triangle(2.6, 6.6);
     T1.display();
     s1.area(T1);	

     Rectangle R1 = new Rectangle(2.4, 9.9);
     R1.display();
     s1.area(R1);	

     Circle C1 = new Circle(5.5);
     C1.display();
     s1.area(C1);	
   }
}//end AreaOfShape