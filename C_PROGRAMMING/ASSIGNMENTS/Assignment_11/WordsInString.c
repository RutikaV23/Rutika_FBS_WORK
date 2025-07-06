//WAP to Calculate the Number of Words Present in a String 
#include<stdio.h>
void main()
{
	char str1[50];
	printf("enter the string : ");
	fgets(str1, sizeof(str1), stdin);
	int count = 0;
	int i=0;
	while(str1[i]!='\0')
	{
		if((str1[i] != ' ' && str1[i] != '\n') && (i == 0 || str1[i-1] == ' ' || str1[i-1] == '\t'))
		{
			count++;
		}
		i++;
	}
	printf("\nstring %d",count);
}