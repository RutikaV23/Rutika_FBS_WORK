//Take two array and add sum in third array 
#include<stdio.h>
void SumArray(int *,int *,int );
void displayArray(int *,int ); 
void main()
{
  int *arr1, *arr2 ;
  int size,sum=0;
  
  printf("enter size : ");
  scanf("%d",&size);
  
  arr1 = (int *)malloc(size * sizeof(int));
  arr2 = (int *)malloc(size * sizeof(int));
  
  printf("enter the array 1 Element : ");
  for(int i=0;i<size;i++)
  {
  	scanf("%d",&arr1[i]);
  }
  printf("enter the array 2 Element : ");
  
  for(int i=0;i<size;i++)
  {
  	scanf("%d",&arr2[i]);
  }
  	
	SumArray(arr1,arr2,size);
	free(arr1);
    free(arr2);
}
 
 void SumArray(int *arr1,int *arr2,int size)
   {
    	int *arr3 = (int *)malloc(size * sizeof(int));
		for(int i=0;i<size;i++)
  		{
  			arr3[i] = arr1[i]+ arr2[i];
  		}
  		
		displayArray(arr3,size);
		free(arr3);
   }

void displayArray(int *arr,int size)
{
	printf("enter the array 3 Element are : ");
   	for(int i=0;i<size;i++)
   		printf("\n%d",arr[i]);
}