#include<stdio.h>
//print sum of factors of number
int Strong();
void main(){

int res = Strong();
      if(res == 1)
      	printf("Strong");
      else
	  	printf("Not Strong");	

}

int Strong()
{
	int n ,sum = 1,r1,res=0;
    printf("enter the number");
	scanf("%d",&n);
   int num = n;
   while(n>0)
   {
   	r1 = n%10 ;
   	sum = 1;
    while(r1 > 0)
     {    
   	    sum = sum * r1 ;
        r1-- ;
     }
       res = res + sum ;
       n = n/10 ;
   }
	if(res == num)
       	return 1;
	else
	   	return 0;
}