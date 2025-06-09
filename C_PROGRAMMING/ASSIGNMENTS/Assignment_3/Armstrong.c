#include<stdio.h>

void main(){

 //check the number is Armstong

   int num = 153,sum = 0 , n1;

   int real = num ;
   
   while(num > 0)
     {    
        n1 = num % 10 ;
   	    sum = sum + n1 * n1 * n1;
	    num = num / 10;
     }
       
	   if(sum == real)
       	printf("It`s Armstrong");
	   else
	   	printf("It`s not Armstrong");
	   
}