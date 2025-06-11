#include <stdio.h>
    void Age();
    void main()
	{
      
      Age();  	   
	   
    }
        
    void Age()
	{
    	int age;
    	printf("enter the age");
    	scanf("%d",&age);
      
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


