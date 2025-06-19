#include<stdio.h>
int Fact(int*);
void main(){

 //print sum of factors of number

   int num ;
   printf("enter the number");
   scanf("%d",&num); 
   Fact(&num);  
   
}

int Fact(int *num)
{
  	int sum = 1;
   
   while(*num > 0)
     {    
   	    sum = sum * (*num);
        (*num)-- ;
     }
       printf("\n%d",sum);
}