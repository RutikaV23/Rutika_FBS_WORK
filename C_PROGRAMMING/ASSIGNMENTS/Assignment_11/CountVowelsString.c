//WAP to Count the Number of Vowels in a String 
#include<stdio.h>
void main()
{
	char str1[50];
	printf("enter the string : ");
	scanf("%s",&str1);

	int count = 0;
	for(int i=0;str1[i]!='\0';i++)
	{
			char ch = str1[i]; 
			if(ch =='a'||ch =='e'||ch =='i'||ch =='o'||ch =='u'||ch =='A'||ch=='E'||ch =='I'||ch=='O'||ch=='U')
			{
				count++;
			}
	}
	printf("The vowels in String is : %d",count);
	
}                               