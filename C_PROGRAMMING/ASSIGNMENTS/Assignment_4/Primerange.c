/* 2.Print prime numbers in the given range 1 to n.  */
#include <stdio.h>
 
void main()
{
	for(int i=2; i<=100; i++)
	{
		int no=i;
	    int flag=0;
	
	    int temp =no;
	
	   for(int j=2; j<=no/2; j++)
	   {
	    	if(no % j==0 )
	      	{
				flag=1;
				break;
			}
    	}
	
		if(flag==0)
		{

			printf("%d\n", temp);
		}
		
	}
}