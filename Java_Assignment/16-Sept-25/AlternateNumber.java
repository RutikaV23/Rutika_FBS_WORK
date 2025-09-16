//5.Print alternate elements in array.

import java.util.Scanner;
class AlternateNumber
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
		
		System.out.println("The Alternate number : ");


		for(int i=0;i<arr.length;i=i+2)
		{
			System.out.println(arr[i]);
		}

			
	}
}