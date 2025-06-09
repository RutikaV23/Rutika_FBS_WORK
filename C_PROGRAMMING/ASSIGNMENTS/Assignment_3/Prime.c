#include<stdio.h>
//check the number is prime or not
void main(){
    
     int prime = 0,n = 12;
     for(int i=2;i<n;i++){
     	if(n%i==0){
     		prime = 1;
     		break;
		 }
	 }
	 if(prime == 0)
	    printf("Prime number");
	  else
	    printf("Prime not number");
}