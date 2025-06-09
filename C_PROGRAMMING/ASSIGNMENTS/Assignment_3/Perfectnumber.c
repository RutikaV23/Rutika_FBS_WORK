#include<stdio.h>
// check the number is perfect number or not  
void main(){
     int n,i = 2,sum = 1;
     printf("enter the number");
     scanf("%d",&n);
     while(i<n){
     	if(n%i == 0)
     	sum = sum + i;
	 i++ ;
    }
	 if(sum == n)
	    printf("Perfect number");
	 else
	    printf("not Perfect number");
	 
   }