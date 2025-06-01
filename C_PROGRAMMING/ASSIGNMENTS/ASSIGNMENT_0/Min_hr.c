//Write a C program to convert given minutes into hours and remaining minutes. 
#include <stdio.h>
void main(){
	int min = 130;
	int hour = min/60;
	int m = min % 60;
	printf(" The hour  is : %d and minutes is %d ",hour,m );
}