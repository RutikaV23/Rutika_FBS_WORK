#include<stdio.h>
//program of search number in array
void main()
{
  int arr1[5];
  
  int sum=0;
  printf("Enter the array 1 Element");
  for(int i=0;i<5;i++)
  {
  	scanf("%d",&arr1[i]);
  }
    reverse(arr1);
}

void reverse(int arr[]){

  printf("The array Element");
  for(int i=4;i>=0;i--)
  {
  	printf("\t%d",arr[i]);
  }
}