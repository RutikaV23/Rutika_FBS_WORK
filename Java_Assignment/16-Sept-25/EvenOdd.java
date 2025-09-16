//4.	Find odd and even among the numbers.

import java.util.Scanner;
class EvenOdd
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

		System.out.println("Even number are : ");
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]% 2 == 0)
				System.out.println(arr[i]);
		}

		System.out.println("Odd number are : ");
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]% 2 != 0)
				System.out.println(arr[i]);
		}

	}
}