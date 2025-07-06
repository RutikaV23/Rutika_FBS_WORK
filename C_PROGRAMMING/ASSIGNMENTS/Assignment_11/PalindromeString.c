//Write a program to check the string is palindrome or not. 
#include<stdio.h>
#include <string.h>

void main() {
    char str[30] ,str1[30] ;
    printf("enter the string : ");
	scanf("%s",&str);
    int len = strlen(str);  
	
	for(int i=0;i<len;i++)
	{
	    str1[i] = str[len-1-i];
	}
	
	str1[len] = '\0';
    
	printf("string str1 %s\n",str1);
 
    if (strcmp(str, str1) == 0) 
	{
        printf("The string is a palindrome.\n");
    } else {
        printf("The string is not a palindrome.\n");
    }
}
