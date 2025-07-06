//WAP to Remove the Characters of Odd Index Values in a String 
#include<stdio.h>
void main()
{
	char str1[50];
	printf("enter the string : ");
	scanf("%s",str1);                               //not to write & becoz str1 is pointing to the first letter or starting index
	
	for(int i=0;str1[i]!='\0';i++)
	{
		if(i%2 == 0)
		{
			printf("%c",str1[i]);
		}
    }
}