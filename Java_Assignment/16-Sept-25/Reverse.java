//9.Reverse the given array.

import java.util.Scanner;
class Reverse
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

		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
		System.out.println("------------------");
		System.out.println("Reverse array Element");
  		
		for(int i=arr.length-1;i>=0;i--)
		  {
		  	System.out.println(arr[i]);
		  }

		
	}
}