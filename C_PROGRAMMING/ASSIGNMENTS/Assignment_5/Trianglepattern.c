#include<stdio.h>
// triangle pattern 

void main(){
    int num;
    printf("Enter the number");
    scanf("%d",&num);
    
	for(int i=0;i<=num;i++)
	{
       for(int j=0;j<i;j++)
	   {
       	  printf("* ");
	   }	
	   printf("\n");
	}
}