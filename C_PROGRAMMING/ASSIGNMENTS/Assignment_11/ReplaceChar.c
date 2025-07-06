//2. WAP Replace all Occurrences of ‘a’ with $ in a String
//strchr()
#include<stdio.h>
void main()
{
	char str[50];
	char s;
	printf("enter the string");
	scanf("%s",&str);
	
//	printf("enter the string");
//	scanf("%s",&s);
	
	for(int i=0;str[i] != '\0';i++)
	{
		if(str[i] == 'a')
		{
			str[i] = '$';
		}
	}
	
	printf("%s",str);
}
