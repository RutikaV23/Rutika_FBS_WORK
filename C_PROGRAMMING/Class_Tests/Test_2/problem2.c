#include<stdio.h>
void main()
{
	int units,sum;
	printf("enter the units ");
	scanf("%d",&units);
    
    if(units >= 151)
	{
		sum = units * 50;
		printf(" \n50rs per unit \nyour units %d \nand you pay %d",units,sum);

	} 
	else if(units >= 51 && units <= 150)
		{
			sum = units * 40;
			printf(" \n40rs per unit \nyour units %d \nand you pay %d",units,sum);
		}
		else if(units >= 1 && units <= 50)
		{   
			sum = units * 30;
			printf("30rs per unit \nyour units %d \nand you pay %d",units,sum);
		}
		else
		{
			printf("units is invalid");
		}
		
	
}
	