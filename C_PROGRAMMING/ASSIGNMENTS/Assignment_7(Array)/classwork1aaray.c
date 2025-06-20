#include<stdio.h>
void main()
{
	int arr1[6];
	
	//sort array number
	printf("enter the first array elements");
	for(int i=0;i<6;i++)
	{
		scanf("%d",&arr1[i]);
	}
	int sort = arr[0];
	for(int i=1;i<6;i++)
	{
	    //printf("\n%d",arr1[i]);
	    if(arr[0]>arr[i]){
	    	arr[0] = arr[i];
	    	arr[i] = arr[0];
		}
	}
	

 }

