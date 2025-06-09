#include<stdio.h>

void main(){

 //print sum of factors of number

   int num = 5,sum = 1;
   
   while(num > 0)
     {    
   	    sum = sum * num ;
        num-- ;
     }
       printf("%d",sum);
	   
}