#include<stdio.h>
//program of search number in array
void search(int *,int );
void main()
{
	int *arr1;
	int n;
	printf("Enter size :");
    scanf("%d",&n);
	arr1 = (int *)malloc(n * sizeof(int));  // where n is the number of elements
	
	printf("Enter the Array elements :");
	for(int i=0;i<n;i++)
	{
		scanf("%d",&arr1[i]);
	}
	  search(arr1,n);
	  free(arr1);
}

void search(int *arr1,int size)
{
	int num,status = 0;
	printf("Enter the element you want to search in Array:");
	scanf("%d",&num);
	
	for(int i=0;i<size;i++)
	{
		if(num == arr1[i])
		{
			printf("%d Element is found at %d index",num,i);
			status = 1;
			break;
		}
	}
	 if(status == 0)
        	printf("Element is not found");	
}