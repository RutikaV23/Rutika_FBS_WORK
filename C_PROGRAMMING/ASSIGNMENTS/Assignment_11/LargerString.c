//WAP to Take in Two Strings and Display the Larger String without Using Built-in Functions 
#include<stdio.h>
void main()
{
	char str1[50];
	char str2[50];
	printf("enter the string 1 : ");
	scanf("%s",&str1);
	printf("enter the string 2 : ");
	scanf("%s",&str2);
	
	int count1 = 0;
	for(int i=0;str1[i]!='\0';i++)
	{
		count1++;
	}
	
	int count2 = 0;
	for(int i=0;str2[i]!='\0';i++)
	{
		count2++;
	}
	
	if(count1 > count2)
	{
		printf("The String 1 is larger - %s",str1);
	}
	else
	{
		printf("The String 2 is larger - %s",str2);
	}
}