#include <stdio.h>
//   CHECK THE YEAR IS LEAP YEAR OR NOT 
void main(){

   int n = 2 ;
   
   if(n % 5 == 0 && n % 3 == 0 ){
   	printf("no. is divisible by both 3 and 5");
   }else
   if(n % 5 == 0 && n % 3 != 0 )
   {
    printf("no. is divisible by 5 but not by 3");	
   }else
   if(n % 5 != 0 && n % 3 == 0 )
   {
    printf("no. is divisible by 3 but not by 5");	
   }
   else{
   	   	printf("no. is not divisible by both 3 and 5");
   }

}