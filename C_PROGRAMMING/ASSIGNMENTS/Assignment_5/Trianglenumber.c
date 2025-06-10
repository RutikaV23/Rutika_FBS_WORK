#include<stdio.h>
// triangle pattern 

void main(){
    int num;
    printf("Enter the number");
    scanf("%d",&num);
    
	for(int i=1;i<=num;i++)
	{
       for(int j=1;j<=i;j++)
	   {
       	  printf("%d",j);
	   }	
	   printf("\n");
	}
}