//6.Accept array and print only prime numbers of array.

//5.Print alternate elements in array.

import java.util.Scanner;
class Prime
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size of array");
		int size = sc.nextInt();
		
		int [] arr = new int[size];

		System.out.println("Enter Array number");
		for(int i=0;i<arr.length;i++)
		{
			arr[i] = sc.nextInt();
		}

		System.out.println("------------------");
		
		System.out.println("The Prime number : ");

		System.out.println("Prime number are ");
   		
		for(int i=0;i<size;i++) 
  		{
  	 		if(arr[i] <= 1) {
            		continue;  // Skip 0 and 1, not prime
        		}
     		
			int prime = 0;
	    
  			for(int j=2;j<=arr[i]/2;j++)
			{
     		
			     if(arr[i]%j==0)
				{
     					prime = 1;
     					break;
		 		}
	 		}
	 
			 if(prime == 0)
				System.out.println("The Prime number : " + arr[i]);
	    			
		}
			
	}
}