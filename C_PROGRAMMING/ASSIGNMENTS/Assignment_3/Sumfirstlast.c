#include<stdio.h>
// add first and last digit of number   
void main()
{	
    int n,last_num,first_num,sum;
    printf("enter the number");
    scanf("%d",&n);
    
    last_num = n%10;
    
	while(n>=10){
		n = n/10;
	}
	first_num = n;
	sum = last_num + first_num;
	printf("\n%d",sum);
}