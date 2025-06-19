#include <stdio.h>
//   CHECK THE NUMBER IS EVEN OR ODD
void EvenOdd(int*);
void main(){
     int n = 11;
//	 printf("enter the number:");
//	 scanf("%d",&n);
     EvenOdd(&n);
}

void EvenOdd(int *n)
{
   
    if(*n%2 == 0)
	{
   		printf("EVEN");
    } 
    else
	{
       printf("ODD");
   }
}