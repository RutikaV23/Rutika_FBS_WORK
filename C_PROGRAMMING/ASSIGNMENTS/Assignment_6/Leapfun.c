#include <stdio.h>
//   CHECK THE YEAR IS LEAP YEAR OR NOT 
void Leap();
void main(){

    Leap();

}

void Leap()
{
	int n;
   printf("enter the number ");
   scanf("%d",&n);
   
  if(n%4 == 0 && n%100 != 0||n%400 == 0){
   	printf("LEAP YEAR");
   } 
   else{
   printf(" NOT LEAP YEAR");
   }
}