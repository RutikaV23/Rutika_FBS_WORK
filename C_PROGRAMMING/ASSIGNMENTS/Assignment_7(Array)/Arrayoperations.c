#include<stdio.h>
void main()
{
	int arr[10];
    storeArray(arr,10);
	displayarray(arr,10);
	replace(arr,10,7,5);
}

void storeArray(int*ptr,int size)
{    
    printf("enter the array elemets");
	for(int i=0;i<size;i++)
	{
		scanf("%d",&ptr[i]);
	}
}

void displayarray(int*ptr,int size)
{ 
    printf("Array elemets are : ");
	for(int i=0;i<size;i++)
	{
		printf("\n%d",ptr[i]);
	}
}

void replace(int*ptr,int size,int num1,int num2)
{ 
	int status = 0;
	for(int i=0;i<size;i++)
	{
		if(num1 == ptr[i])
		{
			ptr[i] = num2;
			status = 1;
		}	
		if(num1 != ptr[i])
			printf("\nnumber is not found");
			break;	
	}
	
	//display after the replace
	if(status == 0)
	{
		printf("\nAfter the replace number"); 
			for(int i=0;i<size;i++)
		{
			printf("\t%d",ptr[i]);
		}
   }
}

