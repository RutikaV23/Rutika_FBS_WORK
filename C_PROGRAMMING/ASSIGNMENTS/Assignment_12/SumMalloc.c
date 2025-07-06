#include <stdio.h>
#include <stdlib.h>  // for malloc and free

void main() {
    int *num1, *num2, *sum;

    // Allocate memory for two integers and the result
    num1 = (int *)malloc(sizeof(int));
    num2 = (int *)malloc(sizeof(int));
    sum  = (int *)malloc(sizeof(int));

    // Check if memory allocation was successful
    if (num1 == NULL || num2 == NULL || sum == NULL) {
        printf("Memory allocation failed!");
        return;
    }

    // Input two numbers
    printf("Enter first number: ");
    scanf("%d", num1);

    printf("Enter second number: ");
    scanf("%d", num2);

    // Add the numbers
    *sum = *num1 + *num2;

    // Display result
    printf("Sum = %d\n", *sum);

    // Free allocated memory
    free(num1);
    free(num2);
    free(sum);
}
