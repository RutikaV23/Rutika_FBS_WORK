// 2.Search the given number in array.

import java.util.Scanner;
class SearchNum
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size of array");
		int size = sc.nextInt();
		
		int [] arr = new int[size];

		System.out.println("Enter the size of array");
		for(int i=0;i<arr.length;i++)
		{
			arr[i] = sc.nextInt();
		}

		System.out.println("------------------");

		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}


		System.out.println("Enter Number you want to search : ");
		int num = sc.nextInt();
		
		for(int i=0;i<arr.length;i++)
		{
			if(num == arr[i])
			{
				System.out.println( num + " Number is found at : " + i + " positions");

			}
		}

		
	}
}