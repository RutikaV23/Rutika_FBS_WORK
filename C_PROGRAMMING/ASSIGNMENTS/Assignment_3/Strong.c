#include<stdio.h>

void main(){

 //print sum of factors of number

   int n = 144,sum = 1,r1,res=0;
   int num = n;
   while(n>0)
   {
   	r1 = n%10 ;
   	sum = 1;
    while(r1 > 0)
     {    
   	    sum = sum * r1 ;
        r1-- ;
     }
       res = res + sum ;
       n = n/10 ;
   }
	if(res == num)
       	printf("It`s Strong");
	else
	   	printf("It`s not Strong");
}