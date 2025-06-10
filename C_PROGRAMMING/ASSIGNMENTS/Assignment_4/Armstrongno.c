#include<stdio.h>
void main(){
	int n,i1,res,sum;
	int num = n;
	printf("Enter the range 1 to :");
	scanf("%d",&n);
	for(int i=1;i<=n;i++){
		while(i>0){
			i1 = i%10 ;
			printf("%d",i1);
			sum = i1*i1*i1;
			res = res + sum;
			i = i/10 ;
		}
	} 
	  if(num == res)
	    printf("%d",res);
	  else
	    printf("");   
}