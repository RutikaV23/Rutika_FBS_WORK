#include <stdio.h>

void main(){
 int hh,min,sec;
//    int hh = 1 ,min = 5 ,sec = 20 ; 
	printf("Enter the hour minutes and Second : ");
	scanf("%d%d%d",&hh,&min,&sec);	   
	 int time = hh * 3600 + min * 60 + sec ;
	 printf("%d",time);  
}


