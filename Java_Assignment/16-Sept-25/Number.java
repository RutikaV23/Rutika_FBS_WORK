//1.	Find minimum and maximum number in array.

import java.util.Scanner;
class Number
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


		int max = arr[0];

		for(int i=0;i<arr.length;i++)
		{

			if(max < arr[i])
			{
				max = arr[i];
			}
		}
		
		System.out.println("Max number : " + max);
		
                int min  = arr[0];

		for(int i=0;i<arr.length;i++)
		{
			if(min > arr[i])
			{
				min = arr[i];
			}
		}
		
		System.out.println("Min number : " + min);

		
	}
}