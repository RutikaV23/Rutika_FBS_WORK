#include <stdio.h>
//   CHECK THE YEAR IS LEAP YEAR OR NOT 
void not_Student();
void Student();
void main(){

   int total,salary;
   printf("enter the number ");
   scanf("%d",&salary);
   
   if(salary <= 5000)
   	Student(salary);
   
   else
     not_Student(salary);

}

void Student(int salary)
{
	float da,ta,hra;
   	da = salary * 0.10 ;
   	ta = salary * 0.20 ;
   	hra = salary * 0.25 ;
   	
   	int total = da + ta + hra ;
	    
	printf("The total salary is : %d",total);
}

void not_Student(int salary)
{
	float da,ta,hra;
	da = salary * 0.15 ;
   	ta = salary * 0.25 ;
   	hra = salary * 0.30 ;
   	
   	int total = da + ta + hra ;
   	
    printf("The total salary is : %d",total);	
}