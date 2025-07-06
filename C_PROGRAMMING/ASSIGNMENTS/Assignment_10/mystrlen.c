//mystrlen function insert manually
#include<stdio.h>
#include<string.h>

int mystrlen(char *src)
{
	int len = 0;
	while(*src != '\0')
	{
		len++;
		src++;
	}	
	return len;
}

void main()
{
	char str1[20] = "advikavaidya";
//	char str2[6] ;
	int res = mystrlen(str1);  //calculate length of string
	printf("string copied %d",res);
}