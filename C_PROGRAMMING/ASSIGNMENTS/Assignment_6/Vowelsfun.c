#include <stdio.h>
//   CHECK THE YEAR IS LEAP YEAR OR NOT 

void leap();

void main(){
  leap();

}

void leap()
{
	char ch;
	printf("enter the number:");
	scanf("%c",&ch);
   
   if(ch == 'a' || ch == 'e'||ch == 'i'||ch == 'o'||ch == 'u'||ch == 'A' || ch == 'E'||ch == 'I'||ch == 'O'||ch == 'U')
   {
   	printf(" %c is ALPHABET IS VOWEL",ch);
   }else
   {
    printf("%c is ALPHABET IS CONSONUNT",ch);	
   }
}