#include <stdio.h>

void main(){
 
      int age = 15 ;
      
        if(age >= 60 )
	        printf("Senior");
	    else
		 {	
			if(age <= 59 && age >=20 )
	           printf("Adult");
		    else
		     {
			    if(age <= 19 && age >=12 )
	                printf("Teenager");
	            else
				if(age < 12){
						printf("Child");
					}
		        }
	        } 	   
	   
       }


