#include<stdio.h>

void main(){

 //print Table of 5.

   int num = 5,n = 1,count = 0;
   while(n <=10){
   	   int cal = num * n; 
   	   printf("\n%d * %d = %d",num,n,cal);
	   n++;
  }
}