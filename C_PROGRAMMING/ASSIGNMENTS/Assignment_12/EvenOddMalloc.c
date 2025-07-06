//4. Find odd and even among the numbers. 
//program of Even and odd number in array 

#include<stdio.h>
void Even(int *, int );
void Odd(int *, int );
void main()
{
  int *arr;
  int n;
  printf("enter size : ");
  scanf("%d",&n);
  
  arr = (int *)malloc(n * sizeof(int));  // where n is the number of elements

  printf("enter the Arrays elements");
  for(int i=0;i<n;i++)
  {
  	scanf("%d",&arr[i]);
  }
     Even(arr,n);
     Odd(arr,n);
     free(arr);
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