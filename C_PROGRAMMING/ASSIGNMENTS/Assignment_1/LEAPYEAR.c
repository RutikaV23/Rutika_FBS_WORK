#include <stdio.h>
//   CHECK THE YEAR IS LEAP YEAR OR NOT 
void main(){

   int n = 13 ;
   
  if(n%4 == 0 && n%100 != 0){
   	printf("LEAP YEAR");
   } 
   else{
   printf(" NOT LEAP YEAR");
   }

}