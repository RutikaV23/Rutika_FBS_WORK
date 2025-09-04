package Assignment_2;

public class Triangle {

	public static void main(String[] args) {
		   int side1 = 12 ,side2 = 10 , side3 = 10;
		   if(side1 != side2 && side2 != side3)
		   {
			   System.out.println("Scalene");
		   }else 
		   if(side1 == side2 && side2 == side3)
		   {
			   System.out.println("Equilateral");
		   }
		   else
		   {
			   System.out.println("Isosceles");
		   }
	}

}
