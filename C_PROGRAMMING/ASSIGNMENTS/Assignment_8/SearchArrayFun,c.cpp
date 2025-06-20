#include<stdio.h>
//program of search number in array
void main()
{
	int arr1[6];
	int num,status = 0;
	printf("Enter the Array elements :");
	for(int i=0;i<6;i++)
	{
		scanf("%d",&arr1[i]);
	}
	  search(arr,6)
}

void search(int arr[],size)
{
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