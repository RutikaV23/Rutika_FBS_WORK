#include<stdio.h>
//program of Even and odd number in array using function
void Even(int arr[], int size);
void Odd(int arr[], int size);
void main()
{
  int arr[5];
  printf("enter the Arrays elements");
  for(int i=0;i<5;i++)
  {
  	scanf("%d",&arr[i]);
  }
     Even(arr,5);
     Odd(arr,5);
}

void Even(int arr[], int size)
{
   printf("Even number");
   for(int i=0;i<size;i++) 
  {
  	if(arr[i]%2 == 0)
	  {
	  	printf("\t%d",arr[i]);
	  }	
  }
} 

void Odd(int arr[], int size)
{
  printf("\nodd number");
  for(int i=0;i<size;i++) 
  {
  	if(arr[i]%2 != 0)
	  {
	  	printf("\t%d",arr[i]);
	  }
  }
}
