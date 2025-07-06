//Print alternate elements in array.
#include<stdio.h>

void alternate(int *,int);
void main()
{
    int *arr;
    int n;
	printf("\n enter size : ");
	scanf("%d",&n);
	arr = (int *)malloc(n * sizeof(int));  // where n is the number of elements
    printf("\n enter the Arrays elements ");
    for(int i=0;i<n;i++)
     {
  		scanf("%d",&arr[i]);
     }
        printf("The Alternate number is : ");
		alternate(arr,n);
		free(arr);
  }
  
 void alternate(int arr[],int size)
{
	for(int i=0;i<size;i=i+2)          // i++ i+2   i=i+2
  {
  	printf("\t%d",arr[i]);
  }
}