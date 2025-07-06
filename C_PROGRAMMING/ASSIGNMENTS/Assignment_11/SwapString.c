//4.WAP to Form a New String where the First Character and the Last Character have been Exchanged 
#include<stdio.h>
void main()
{
	char str1[50];
	char str2[50];
	
	printf("enter the string 1: ");
	scanf("%s",str1);	
	strcpy(str2, str1);
	printf("final String: %s",str2);

	int len = strlen(str2);
//	printf("%d",len);
	char temp ;
	temp = str2[0];
	str2[0]=str2[len-1];
	str2[len] = temp;
	
	printf("\n final String: %s",str2);
	  
}