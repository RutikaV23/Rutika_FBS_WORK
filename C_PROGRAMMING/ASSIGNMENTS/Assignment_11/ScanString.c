/*Write a program to scan string from user then scan a single character and search it in a accepted string.*/
#include<stdio.h>
void main()
{
	char str[10] = "Rutika";
	char letter;
	int strr = 0;
	printf("enter the String");
	scanf("%c",&letter);

	for(int i=0;str[i]!='\0';i++)
	{	
		if(letter == str[i])
		{
			printf("%c char found at this index %d",letter,i);
			strr = 1;
			break;
		}
	}
		if(strr != 1)
		{
			printf("%c char not found at this String",letter);
	    }
}