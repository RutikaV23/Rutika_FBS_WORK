#include<stdio.h>
//program of min and max number in array using function
void main()
{
	//First array number
	int arr1[6];
	printf("enter the first array elements");
	for(int i=0;i<6;i++)
	{
		scanf("%d",&arr1[i]);
	}
	int minn = arr1[0];
	int maxx = arr1[0];
	
	min(minn,6,arr1);
	max(maxx,6,arr1);
	
}

void min(int min,int size,int arr1[])
  {
	//int min = arr1[0];
	for(int i=0;i<size;i++)
	{
	    if(min > arr1[i])
	    	min = arr1[i];	    	   
    }
    printf("\n min %d",min);
  }

void max(int max,int size,int arr1[])
{
	//int max = arr1[0];
	for(int i=0;i<size;i++)
	{
	    if(max < arr1[i]){
	    	max = arr1[i];	
        }
	}	
	printf("\n max %d",max);
}
