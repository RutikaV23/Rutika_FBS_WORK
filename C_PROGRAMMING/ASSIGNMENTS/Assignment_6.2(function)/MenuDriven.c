#include<stdio.h>
//menu driven 
void main(){
	int ch;
	printf("1:EVENODD 2:PRIME 3:PALINDROM 4:CHECKNUMBER 5:REVERSE 6:SUM");
	printf("\nenter your choice");
	scanf("%d",&ch);
	if(ch == 1){
	
		evenodd();
		if(ch == 2)
			prime();
			if(ch == 3)
				palindrome();
				if(ch == 4)
					checknumber();
					if(ch == 5)
						reverse();
						if(ch == 6)
							sum();				
   }else
   {
   	 printf("invalid choice");
   }
}

void evenodd()
{   
    int num ,sum = 0 , n1;
    printf("enter the number");
    scanf("%d",&num);
	if(num%2 == 0){
   			printf("EVEN");
   		} 
   		else{
   			printf("ODD");
   		}
}

void prime()
{
	int n ,prime = 0;
	printf("enter the number");
	scanf("%d",&n);
	
	for(int i=2;i<n;i++){
     	if(n%i==0){
     		prime = 1;
     		break;
		 }
	 }
	 if(prime == 0)
	    printf("It`s a prime");
	 else
	  	printf("It`s a prime");
	    
}

void palindrome()
{
	  int num ,sum = 0 , n1;
      printf("enter the number");
      scanf("%d",&num);
      int real = num ;
      while(num > 0)
     {    
        n1 = num % 10 ;
	    num = num / 10;
	    sum = sum * 10 + n1;
     }
	   if(sum == real)
       	printf("It`s a palindrome");
	   else
	   	printf("It`s a not palindrome");
}

void checknumber()
{
	int n ;
	printf("enter the number");
    scanf("%d",&n);
   if(n > 0){
   		printf("POSITIVE");
    	}
	else
   		if(n<0)
		   {
   			printf("NEGATIVE");
  		 	}else
			   {
			   	printf("ZERO");
			   }
}

void reverse()
{
  	int n ,rev = 0,n1;
	printf("enter the number");
    scanf("%d",&n);
    while(n>0){
    	n1 = n%10;
    	rev = rev *10 + n1;
    	n = n/10;
	}
	printf("%d",rev);
}

void sum()
{   
    int a,b,sum;
	printf("enter the number");
    scanf("%d%d",&a,&b);
    sum = a + b;
    printf("%d",sum);
}
