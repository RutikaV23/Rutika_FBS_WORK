/*
7.	Take two array and add sum in third array
Example-
arr[5]= {1,2, 3, 4,5}
brr[5]={10,20,30, 40, 50}
crr[5]={11,22,33,44,55}
*/

import java.util.Scanner;
class SumTwoArray
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size of array");
		int size = sc.nextInt();
		
		int [] arr1 = new int[size];
		int [] arr2 = new int[size];
		int [] arr3 = new int[size];

		System.out.println("Enter Array-1 number");
		for(int i=0;i<arr1.length;i++)
		{
			arr1[i] = sc.nextInt();
		}

		System.out.println("------------------");
		
		System.out.println("Enter Array-2 number");
		for(int i=0;i<arr2.length;i++)
		{
			arr2[i] = sc.nextInt();
		}
		
		System.out.println("------------------");

		for(int i=0;i<arr3.length;i++)
  		{
  			arr3[i] = arr1[i]+ arr2[i];
  		}
		
		System.out.println("Enter the array 3 Element are");
   		
		for(int i=0;i<arr3.length;i++)
   		System.out.println(arr3[i]);

			
	}
}
