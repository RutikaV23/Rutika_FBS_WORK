#include <stdio.h>
    void Greater();
    void main()
	{
        
        Greater();		 
    }

    void Greater()
		 {  
		    int a, b, c;
		    printf("enter the numbers");
		    scanf("%d%d%d",&a,&b,&c);
		 	if(a>b && a>c)
		        printf("a is greater");
		 
		   else if(b>a && b>c)
		        printf("b is greater");
		 
		    else
		        printf("c is greater");
		 }