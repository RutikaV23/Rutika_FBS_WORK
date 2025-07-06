//Accept array and print only prime numbers of array.
#include<stdio.h>

void main()
{
   int *arr;
   int size;
   printf("enter size : ");
   scanf("%d",&size);
   
   arr = (int *)malloc(size * sizeof(int));  // where n is the number of elements
   printf("enter the Arrays elements");
   for(int i=0;i<size;i++)
  {
  	scanf("%d",&arr[i]);
  }
    Prime(arr,size);
    free(arr);
}
  
void Prime(int arr[],int range)
{
	printf("Prime number are ");
   for(int i=0;i<range;i++) 
  {
  	 if(arr[i] <= 1) {
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