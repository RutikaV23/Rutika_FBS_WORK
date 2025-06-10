#include<stdio.h>

void main(){

 //print sum numbers from 1 to 5

   int start ,end ,sum = 0;
   printf("enter the start and end of the number ");
   scanf("%d%d",&start ,&end );
   for(int i=start;i<=end;i++)
   {
        sum = sum + i;
   }
        printf("\n%d",sum);
   
}