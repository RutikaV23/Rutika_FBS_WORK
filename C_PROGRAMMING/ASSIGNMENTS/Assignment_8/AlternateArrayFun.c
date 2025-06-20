#include<stdio.h>
//program of Even and odd number in array
void alternate(int,int);
void main()
{
  int arr[6];
  printf("enter the Arrays elements");
  for(int i=0;i<6;i++)
  {
  	scanf("%d",&arr[i]);
  }
    alternate(arr,6);
}

 void alternate(int arr[],int size)
{
	for(int i=0;i<size;i=i+2)          // i++ i+2   i=i+2
  {
  	printf("%d",arr[i]);
  }
}