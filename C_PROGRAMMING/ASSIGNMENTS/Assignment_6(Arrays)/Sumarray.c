#include<stdio.h>
//program of search number in array
void main()
{
  int arrays[5];
  int sum=0;
  printf("enter the array Element");
  for(int i=0;i<5;i++)
  {
  	scanf("%d",&arrays[i]);
  }
  for(int i=0;i<5;i++)
  {
  	sum = sum + arrays[i];
  }
   printf("Sum of Arrays Elements %d",sum);
}