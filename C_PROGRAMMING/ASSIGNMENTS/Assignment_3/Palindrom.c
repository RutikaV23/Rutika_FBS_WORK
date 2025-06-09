#include<stdio.h>
//palindrom number
void main(){
      int num = 121, sum = 0 , n1;
      int real = num ;
      while(num > 0)
     {    
        n1 = num % 10 ;
	    num = num / 10;
	    sum = sum * 10 + n1;
     }
	   if(sum == real)
       	printf("It`s Palindrom");
	   else
	   	printf("It`s not Palindrom");
}