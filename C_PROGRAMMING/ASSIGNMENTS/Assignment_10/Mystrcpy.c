//mystrcpy function insert manually
#include<stdio.h>
#include<string.h>

void mystrcpy(char *dest,char *src)
{
	while(*src != '\0')
	{
		*dest = *src;
		dest++;
		src++;
	}	
	*dest = '\0';
}

void main()
{
	char str1[6] = "Rutika";
	char str2[6] ;
	mystrcpy(str2,str1);  //copied str1 into str2
	printf("string copied %s",str2);
}