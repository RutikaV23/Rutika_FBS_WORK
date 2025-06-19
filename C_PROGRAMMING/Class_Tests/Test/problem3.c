#include<stdio.h>
//print the even odd number in the given range
void main()
{
	int start,end;
	printf("Enter the range start and end");
	scanf("%d%d",&start,&end);
	printf("Odd number");
	for(int i=start;i<=end;i++)
	{
	  	if(i%2 != 0)
	  		printf("\n%d",i);
	
	}
	printf("\nEven number");
	for(int i=start;i<=end;i++)
	{
	  	if(i%2 == 0)
	  		printf("\n%d",i);
	
	}
 }
	
