#include <stdio.h>
//   CHECK THE  PALINDROM NUMBER
void main(){

   int num = 111 ;
   int r1 = num % 10 ;
   int r2 = num /10 ;
   int r3 = r2 % 10 ;
   int r4 = r2 / 10 ;
   
   int rev = r1 * 100 + r3 * 10 + r4 ;
   if(rev == num){
   	printf("PALINDROM");
   }else
   {
    printf("NOT PALINDROM");	
   }

}