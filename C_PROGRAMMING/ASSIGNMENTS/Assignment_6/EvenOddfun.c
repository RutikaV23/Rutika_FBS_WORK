#include <stdio.h>
//   CHECK THE NUMBER IS EVEN OR ODD
void EvenOdd();
void main(){

EvenOdd();
}

void EvenOdd()
{
	 int n;
	 printf("enter the number:");
	 scanf("%d",&n);
   
    if(n%2 == 0)
	{
   		printf("EVEN");
    } 
    else
	{
       printf("ODD");
   }
}