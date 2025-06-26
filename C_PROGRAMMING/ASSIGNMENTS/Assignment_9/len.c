#include<stdio.h>
#include<string.h>
//int main()
//{
//	char str[] = "hello";
//	printf("length = %d",strlen(str));
//}

//int main()
//{
//	char src[]="world";
//	char dest[10];
//	strcpy(dest,src);
//	printf("copied:%s",dest);
//}


int main() {
    char str1[] = "Hello";
    char str2[] = "World";
    printf("%d\n", strcmp(str1, str2)); // Output: negative value
    return 0;
}