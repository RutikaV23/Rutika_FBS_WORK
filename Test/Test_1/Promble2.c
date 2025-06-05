#include <stdio.h>

void main(){
        int year ;
        printf("enter:");
        scanf("%d",&year);
		    
			if(year % 4 == 0 && year% 100 != 0)
			{
        	printf("It is leap Year");
		    }
			else
			{
			printf("It is not leap Year");
		    }
}
