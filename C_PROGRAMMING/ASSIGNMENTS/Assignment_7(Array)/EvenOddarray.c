#include<stdio.h>
//program of Even and odd number in array
void main()
{
  int arr[5];
  printf("enter the Arrays elements");
  for(int i=0;i<5;i++)
  {
  	scanf("%d",&arr[i]);
  }
   printf("Even number");
   for(int i=0;i<5;i++) 
  {
  	if(arr[i]%2 == 0)
	  {
	  	printf("\t%d",arr[i]);
	  }	
  }
  printf("\nodd number");
 for(int i=0;i<5;i++) 
  {
  	if(arr[i]%2 != 0)
	  {
	  	printf("\t%d",arr[i]);
	  }
  }
}
