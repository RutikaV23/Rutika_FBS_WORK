#include<stdio.h>
//palindrom number
int Palidrom();
void main()
{
      int res = Palidrom();
      if(res == 1)
      	printf("Palidrom");
      else
	  	printf("Not Palidrom");	
}

 int Palidrom()
 {
 	int num ,sum = 0 , n1;
      printf("enter the number");
      scanf("%d",&num);
      int real = num ;
      while(num > 0)
     {    
        n1 = num % 10 ;
	    num = num / 10;
	    sum = sum * 10 + n1;
     }
	   if(sum == real)
       	return 1;
	   else
	   	return 0;
 }