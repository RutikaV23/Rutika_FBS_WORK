#include <stdio.h>
//   CHECK THE YEAR IS LEAP YEAR OR NOT 
void main(){

   int total,salary = 1000 ;
   float da,ta,hra;
   
   if(salary <= 5000){
   	da = salary * 0.10 ;
   	ta = salary * 0.20 ;
   	hra = salary * 0.25 ;
   	
   	total = da + ta + hra ;
	    
	printf("The total salary is : %d",total);
   }
   
   else
   {
   	da = salary * 0.15 ;
   	ta = salary * 0.25 ;
   	hra = salary * 0.30 ;
   	
   	total = da + ta + hra ;
   	
    printf("The total salary is : %d",total);	
   }

}