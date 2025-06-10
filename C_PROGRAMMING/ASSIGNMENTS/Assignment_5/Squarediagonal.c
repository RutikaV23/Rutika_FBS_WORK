#include<stdio.h>
// Square diagonal pattern 
void main(){
	int num;
//	printf("enter the number");
//	scanf("%d",&num);
	for(int i=1;i<=5;i++)
	{
		for(int j=1;j<=5;j++)
		{
			if(i==1||i==5||j==1||j==5||i==j)
			printf(" * ");
			else
			printf("   ");
		}
		printf("\n"); 
	}
}