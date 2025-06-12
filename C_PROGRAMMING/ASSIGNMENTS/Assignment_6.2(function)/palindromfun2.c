#include<stdio.h>
//palindrom number
int Palidrom(int num,int sum);
void main()
{     int num,sum = 0 ;
      printf("enter the number");
      scanf("%d",&num);

      int res = Palidrom(num,sum);
      if(res == 1)
      	printf("Palidrom");
      else
	  	printf("Not Palidrom");	
}

 int Palidrom(int num,int sum)
 {
 	int n1;
      
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