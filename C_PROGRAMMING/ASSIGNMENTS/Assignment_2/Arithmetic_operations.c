#include <stdio.h>
// Arithmetic operations 
void main(){

   int a,b,ch;
   float res1,res2,res3,res4,res5;
   printf("Enter the a and b ");
   scanf("%d%d",&a,&b);
   
   printf("Enter the arithmetic operatins which perfoms : ");
   printf("1: Addition  2: Multiplication  3:Division 4:Subtraction  5:Modulus ");
   scanf("%d",&ch);
   
   switch(ch){
   	case 1: res1 = a + b ;
	        printf("%f",res1 );
   	break;
   	case 2: res2 = a * b ;
   	        printf("%f",res2 );
   	break;
   	case 3: res3 = a / b ;
   	        printf("%f",res3 );
   	break;
   	case 4: res4 =a - b;
   	        printf("%f",res4 );
   	break;
   	case 5: res5 =a % b ;
   	        printf("%f",res5 );
   	break;
   }
}