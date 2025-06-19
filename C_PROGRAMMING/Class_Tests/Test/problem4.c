#include<stdio.h>
//print the even odd number in the given range
void main()
{
	int start,end,sum=0;
	printf("Enter the range start and end");
	scanf("%d%d",&start,&end);
	for(int i=start;i<=end;i=i+2)
	{
		sum = sum + i;
	}
	printf("The sum of alternate number is : %d",sum);
}