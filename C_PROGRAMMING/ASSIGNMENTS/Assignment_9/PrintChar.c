#include<stdio.h>
int mystrchr(char*,char);
void main()
{
	char str[8] = "Solutions";
	char a = 'i';
	
	int result =  mystrchr(str, a);
	if(result==-1)
		printf("character not found");
	else
		printf("%c character found at %d ",a,result);
}

int mystrchr(char* str, char a)
{
	int i=0;
	while(str[i]!='\0')
	{
		if(str[i]==a)
		{
			return i;
		}
		i++;
	}
  return -1;
}