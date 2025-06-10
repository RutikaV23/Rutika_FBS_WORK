#include<stdio.h>
// pyramid triangle pattern 
void main(){
    
	int num;
    printf("Enter the number");
    scanf("%d",&num);
    
    for(int i=1;i<=num;i++)
	{
       for(int j=1;j<=num-i;j++)
	   {
	   	    printf(" ");
	   	    printf(" ");
		}
			for(int j=1;j<=i;j++)
	       {
			 printf(" * ");
			 printf(" ");
	       }
	   printf("\n");
	}
    
	for(int i=num-1;i>=1;i--)
	{
       for(int j=1;j<=num-i;j++)
	   {
	   	    printf(" ");
	   	    printf(" ");
		}
			for(int j=1;j<=i;j++)
	       {
			 printf(" * ");
			 printf(" ");
	       }
	   printf("\n");
	}
}