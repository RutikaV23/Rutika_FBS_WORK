#include<stdio.h>
// add first and last digit of number   
int FirstLast(int*);
void main()
{	
    int n,sum;
    printf("enter the number");
    scanf("%d",&n);
    FirstLast(&n);
    printf("%d",sum);
}

int FirstLast(int *n)
{
	int last_num = *n%10;
	while(*n>=10){
		*n = *n/10;
	}
	int first_num = *n;
	int sum = last_num + first_num;
    return sum;
}


