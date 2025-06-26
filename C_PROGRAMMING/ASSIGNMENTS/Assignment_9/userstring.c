#include<stdio.h>
void main()
{
//	char str[10]; 
//	printf("enter the string");
//	scanf("%s",&str);	
//	printf("%s",str);
	
//	char str[] = "Firstbit";
//	printf("%s",str);          //printf the srting
//    
//	int length = strlen(str);
//    printf("\n%d",length);        //calculate the string
//    
    
     char str[10] = "first";
     int i = 0;
     char ch;
	 do
	 {
	 	scanf("%c",&ch);
	 	str[i]=ch;
	 	i++;
	 }while(ch!='\n'&&ch!=' ');
	   str[i]='\0';
	   
	   i=0;
	   while(str[i]!='\0')
	   {
	   	printf("%c",str[i]);
	   	i++;
	   }
}