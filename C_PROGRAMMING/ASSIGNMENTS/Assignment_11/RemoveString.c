//3. WAP to Remove the nth Index Character from a Non-Empty String
#include<stdio.h>
void main()
{
	char str[50];
	int find;
	
	printf("\n enter the string");
	scanf("%s",&str);
	
	printf("\n enter the index which remove in the string \n ");
	scanf("%d",&find);
	
	for(int i=find;str[i] != '\0';i++)
	{
			str[i] = str[i + 1];
	}
	
	printf("\n String : %s",str);
	
}