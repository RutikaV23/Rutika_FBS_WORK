#include<stdio.h>
//program of merge two array in array
void main()
{
  int arr1[5];
  int arr2[5];
  int arr3[10];
  int sum=0;
  printf("enter the array 1 Element");
  for(int i=0;i<5;i++)
  {
  	scanf("%d",&arr1[i]);
  }
  printf("enter the array 2 Element");
  for(int i=0;i<5;i++)
  {
  	scanf("%d",&arr2[i]);
  }
 
}

void Array1(int arr1[])
{
	for(int i=0;i<5;i++)
  {
  	int arr3[i] = arr1[i] ;  
  }
    Array2(arr2);
}

void Array2(int arr[])
{
	for(int i=0;i<5;i++)
  {
  	int arr3[i+5] = arr2[i] ;  
  }
  for(int i=0;i<10;i++)
  {
  	printf("%d",arr3[i]);
  }
}