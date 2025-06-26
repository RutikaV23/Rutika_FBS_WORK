#include <stdio.h>
#include <string.h>

int main()
{
    int result1 = strcmp("abc", "abc"); // result = 0 (means equal)
    printf("strcmp1 result: %d\n", result1); // prints 0

    int result2 = strcmp("abc", "abd"); // result = -1 (means equal)
    printf("strcmp2 result: %d\n", result2);
    
    int result3 = strcmp("abd", "abc"); // result = 1 (means equal)
    printf("strcmp3 result: %d\n", result3);
    
    int result4 = strncmp("abd", "adc",2); // result = 0 (means first two character are equal)
    printf("strcmp4 result: %d\n", result4);  // result = -2 (means first one character are equal)
                                               // result = -ve (means character are not equal) 
    return 0;
}
