#include<stdio.h>
//program of search number in array
void main()
{
  int arr1[5];
  int arr2[5];
  int arr3[5];
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
  for(int i=0;i<5;i++)
  {
  	arr3[i] = arr1[i]+ arr2[i];
  }
   printf("enter the array 3 Element are");
   for(int i=0;i<5;i++)
   printf("\n%d",arr3[i]);
   
}