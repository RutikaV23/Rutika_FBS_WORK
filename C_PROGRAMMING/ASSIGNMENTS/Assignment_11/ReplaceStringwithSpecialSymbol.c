//WAP to Take in a String and Replace Every Blank Space with special symbol. 

/* 	fgets(name, sizeof(name), stdin); = “Read from the keyboard, store the input into name, 
and don’t read more than sizeof(name) characters (including \0). 
Stop reading when newline (\n) or EOF is reached.” */

#include<stdio.h>
void main()
{
	char str1[50];
	printf("enter the string : ");
	fgets(str1, sizeof(str1), stdin);
	printf("\nstring %s",str1);
	
	char special;
	printf("enter the special charater : ");
	scanf("%c",&special);
	
	for(int i=0;str1[i]!='\0';i++)
	{
		if(str1[i] == ' ')
		{
			//str1[i] = '&';
			str1[i] = special;
		}
	}

	printf("\nstring %s",str1);
}