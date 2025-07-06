//Find sum of all numbers.  
#include <stdio.h>
#include <stdlib.h>

void sumArray(int *,int );
void main()
{
  int *arrays;
  int n;
    
    printf("Enter size: ");
    scanf("%d", &n);
    
	arrays = (int *)malloc(n * sizeof(int));  // where n is the number of elements

 if (arrays == NULL) 
    {
        printf("Memory allocation failed!");
        return;
    }
    
  printf("enter the array Element : ");
  for(int i=0;i<n;i++)
  {
  	scanf("%d",&arrays[i]);
  }
  	sumArray(arrays,n);
  	free(arrays);
}

void sumArray(int *arr,int size)
{
	int sum=0;
	for(int i=0;i<size;i++)
  {
  	sum = sum + arr[i];
  }
   printf("Sum of Arrays Elements %d",sum);
}