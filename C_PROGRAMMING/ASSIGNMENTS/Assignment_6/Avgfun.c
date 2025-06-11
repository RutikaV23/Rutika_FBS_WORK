#include <stdio.h>
//Write a C program to input five numbers and find their average. 

void Avg();
void main(){
	Avg();
}

void Avg(){
	int a = 10;
	int b = 20;
	int c = 30;
	int d = 40;
	int e = 17;
	printf("enter the number:");
	scanf("%d%d%d%d%d",&a,&b,&c,&d,&e);
	
	float avg = ( a+b+c+d+e ) / 5;			
	printf(" The result is : %.4f",avg );
}