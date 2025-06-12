//print sum of factors of number
#include<stdio.h>
int factorial();
void main(){
   
   printf("%d",factorial());
      
}

   int factorial()
   {
   	int num ,sum = 1;
   printf("enter the number");
   scanf("%d",&num);
      
   while(num > 0)
     {    
   	    sum = sum * num ;
        num-- ;
     }
       return sum;
   }