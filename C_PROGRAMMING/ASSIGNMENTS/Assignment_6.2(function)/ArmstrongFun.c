/*  5 Check the given number is Armstrong number or not..
Input: n = 153
Output: Armstrong  */

#include <stdio.h>
int armstrong(int no);
void main()
{
	
	int no,result;
	printf("Enter a Number: ");
	scanf("%d", &no);
	
	result = armstrong(no);
	if(result == 1)
		printf("Armstrong Number");
	else
		printf("Not Armstrong Number");
	
}

int armstrong(int no){
	int rem,res,sum=0;
	int temp=no;
	
	int count=0;
	while(no > 0)
	{
		count++;
		no =no/10;
	}
	
	no= temp;
	
	while(no>0)
	{
		rem=no%10;
		int res=1, i =1;
		while(i<=count)
		{
			res=res* rem;
			i++;
		}
		
		sum=sum+res;
		no = no/10;
	}
	
	if(sum==temp)
	{
		return 1;
	}
	else
	{
		return 0;
	}
}