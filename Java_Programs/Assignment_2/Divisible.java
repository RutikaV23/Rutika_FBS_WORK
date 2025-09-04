package Assignment_2;

public class Divisible {

	public static void main(String[] args) {
		int n = 3 ;
		   
		   if(n % 5 == 0 && n % 3 == 0 ){
			   System.out.printf("no. is divisible by both 3 and 5");
		   }else
		   if(n % 5 == 0 && n % 3 != 0 )
		   {
			   System.out.printf("no. is divisible by 5 but not by 3");	
		   }else
		   if(n % 5 != 0 && n % 3 == 0 )
		   {
			   System.out.printf("no. is divisible by 3 but not by 5");	
		   }
		   else{
			   System.out.printf("no. is not divisible by both 3 and 5");
		   }

     }
	}
