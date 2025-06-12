#include<stdio.h>
//check the number is prime or not
int Prime(int n ,int prime);
void main(){
     
    int n ,prime = 0;
	printf("enter the number");
	scanf("%d",&n);
     int res = Prime(n,prime);
      if(res == 1)
      	printf("it`s prime");
      else
	  	printf("it`s not prime");	
     
} //end main

int Prime(int n ,int prime)
{
	for(int i=2;i<n;i++){
     	if(n%i==0){
     		prime = 1;
     		break;
		 }
	 }
	 if(prime == 0)
	     return 1;
	  else
	    return 0;
} //end function