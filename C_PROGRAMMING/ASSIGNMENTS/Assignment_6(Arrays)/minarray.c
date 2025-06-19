#include<stdio.h>
//program of min and max number in array
void main()
{
	int arr1[6];

	//First array number
	printf("enter the first array elements");
	for(int i=0;i<6;i++)
	{
		scanf("%d",&arr1[i]);
	}
	int min = arr1[0];
	for(int i=0;i<6;i++)
	{
	    if(min > arr1[i]){
	    	min = arr1[i];
	    	//printf("\n min%d",min);
        }
	}	
	printf("\n min %d",min);
	
	int max = arr1[0];
	for(int i=0;i<6;i++)
	{
	    if(max < arr1[i]){
	    	max = arr1[i];
	    	//printf("\n min%d",min);
        }
	}	
	printf("\n max %d",max);
}