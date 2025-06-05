#include <stdio.h>
//   CHECK THE Triangle is Scalene ,Equilateral,Scalene
void main(){

   int side1 = 12 ,side2 = 10 , side3 = 10;
   if(side1 != side2 && side2 != side3)
   {
     	printf("Scalene");
   }else 
   if(side1 == side2 && side2 == side3)
   {
   	printf("Equilateral");
   }
   else
   {
    printf("Isosceles");
   }

}