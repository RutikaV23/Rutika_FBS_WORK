#include <stdio.h>
//find the square and cube of number
void main(){
	int n ;
	printf("enter the number ");
    scanf("%d",&n);
    square(n);
    cube(n);
}

void square(int n){
	int square = n * n;
	printf(" The square  is : %d :",square);
}

void cube(int n){
	int cube = n * n * n;
	printf(" The cube  is : %d :",cube);
}