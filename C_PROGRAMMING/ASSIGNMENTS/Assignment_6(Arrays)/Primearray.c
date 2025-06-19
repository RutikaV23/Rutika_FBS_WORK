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
  printf("Prime number are ");
   for(int i=0;i<5;i++) 
  {
  	 if (arr[i] <= 1) {
            continue;  // Skip 0 and 1, not prime
        }
     int prime = 0;
	    
  	for(int j=2;j<=arr[i]/2;j++){
     	
		 if(arr[i]%j==0){
     		prime = 1;
     		
     		break;
		 }
	 }
	 if(prime == 0)
	    printf("\t%d",arr[i]);
   }
}
  
