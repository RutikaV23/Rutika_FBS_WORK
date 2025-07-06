//Reverse the given array. 
#include<stdio.h>
void reverse(int *arr,int size);
void main()
{
  	int *arr1;
  	int size;
  	printf("Enter size : ");
  	scanf("%d",&size);  	
	arr1 = (int *)malloc(size * sizeof(int));

  	int sum=0;
  	printf("Enter the array 1 Element");
  
    for(int i=0;i<size;i++)
    {
  		scanf("%d",&arr1[i]);
    }
  
  	reverse(arr1,size);
}

void reverse(int *arr,int size)
{
	printf("The array Element");
    for(int i=size-1;i>=0;i--)
    {
  	  printf("\t %d",arr[i]);
    }
}