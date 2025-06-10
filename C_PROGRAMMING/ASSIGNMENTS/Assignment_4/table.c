#include<stdio.h>
// check the number table  
void main()
{
   int n;
   printf("enter the number ");
   scanf("%d",&n);
   for(int i=0;i<=10;i++){
   	int cal = n * i;
   	printf("\n%d * %d = %d",n,i,cal);
   }
   
}
