#include<stdio.h>
// Square pattern 
void main(){
	int num;
	printf("enter the number");
	scanf("%d",&num);
	for(int i=0;i<num;i++)
	{
		for(int j=0;j<num;j++)
		{
			printf("* ");
		}
		printf("\n"); 
	}
}