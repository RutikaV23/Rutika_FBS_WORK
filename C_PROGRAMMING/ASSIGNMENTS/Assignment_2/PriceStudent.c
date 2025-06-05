//check the user is student or not if user is student he/she got the discount another wise not 

#include <stdio.h>

     void main(){
        int price,n,total ;
        float Discount;
        printf("Enter THE Price ");
        scanf("\n%d", &price);
        
        printf("YOU ARE THE STUDENT : 1:YES  2:NO ");
        scanf("\n%d", &n);
        switch(n){
            case 1:printf("\nYES");
            if(price>500)
			{
               Discount = price * 0.25;
            }
			else
			{
               Discount = price * 0.10;
            }
                total = price - Discount; 
                printf("\nAmount paid :%d",total );
            break;

            case 2:printf("\nNO");
            if(price>500)
			{
               Discount = price * 0.15;
            }
			else
			{
               Discount = 0;
            }
              
	        total = price - Discount; 
            printf("\nAmount paid :%d",total );
			break;
        }
    }

