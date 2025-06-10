#include<stdio.h>
// check the number is perfect number or not  
void main()
{
     int n,sum = 1;
     printf("enter the number");
     scanf("%d",&n);
     for(int i=2;i<n;i++)
	 {
     	if(n%i == 0)
     	sum = sum + i;
	 }
	 
	 if(sum == n)
	    printf("Perfect number");
	 else
	    printf("not Perfect number");
	 
 }
 