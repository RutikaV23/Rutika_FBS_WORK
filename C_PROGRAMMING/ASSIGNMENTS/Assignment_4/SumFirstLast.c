#include<stdio.h>
// add first and last digit of number   
void main()
{	
    int n;
    printf("enter the number");
    scanf("%d",&n);
    
    int last_num = n%10;
    
	while(n<10)
      n = n%10;
    
	int first_num = n;
	
	sum = last_num + first_num;
	printf("\n%d",sum)
}