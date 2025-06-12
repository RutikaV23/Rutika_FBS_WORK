/* 3. Print perfect numbers in the given range 1 to n  */

#include <stdio.h>
void perfect();
void main()
{
	perfect();
	

}

void perfect()
{
	int num;
	printf("enter the range of number");
    scanf("%d",&num);
	for(int i=1; i<=num; i++)
	{
		int sum=0, no=i;
		for(int j=1; j<no; j++ )
		{
			if(no % j==0)
			{
				sum= sum + j;
			}
		}
		
		if( no == sum)
		{
			printf("\n%d",no);
		}
	}
}