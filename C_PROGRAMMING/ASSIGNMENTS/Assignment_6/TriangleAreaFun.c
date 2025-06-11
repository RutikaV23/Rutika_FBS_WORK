#include <stdio.h>
// find the area of triangle
void area();
void main(){
	area();
} 

void area()
{
	int base;
	int height ;
	printf("enter the number:");
	scanf("%d%d",&base,&height);
	
	float area = 0.5 * base * height ;
	
	printf(" \nThe result is a : %f",area );
}