//mystrcmp  function insert manually
#include<stdio.h>
#include<string.h>

int mystrcmp(char *dest,char *src)
{
	while(*src != '\0' && *dest != '\0')
	{
	    if(*dest == *src)
		{
		dest++;
		src++;
		}
		
		if(*dest != *src)
		break;
	}	
      return (*dest - *src);
}

void main()
{
	char str1[20] = "xy";
	char str2[10] = "abc";
	int result = mystrcmp(str2,str1);  //compare str1 into str2
	
	if(result == 0) {
        printf("Strings are equal.\n");
    } else if(result < 0) {
        printf("String 1 is less than String 2.\n");
    } else {
        printf("String 1 is greater than String 2.\n");
    }
	
}