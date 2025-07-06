#include <stdio.h>

void findMinMax(int *,int, int *,int *);
void main() {
    int arr[100],n,min,max;
	
	// Allocate memory for two integers and the result
    min = (int *)malloc(sizeof(int));
    max = (int *)malloc(sizeof(int));
    n  = (int *)malloc(sizeof(int));

    // Check if memory allocation was successful
    if (min == NULL || max == NULL || n == NULL) {
        printf("Memory allocation failed!");
        return;
    }
    
    printf("Enter array size: ");
    scanf("%d", &n);

    printf("Enter %d elements:\n", n);
    for(int i = 0; i < n; i++)
        scanf("%d", &arr[i]);

    findMinMax(arr, n, &min, &max);

    printf("Minimum = %d\nMaximum = %d\n", min, max);
    
    // Free allocated memory
    free(min);
    free(max);
    free(n);
}

void findMinMax(int *arr, int size, int *min, int *max) {
    *min = *max = arr[0];
    for(int i = 1; i < size; i++) {
        if (arr[i] < *min)
            *min = arr[i];
        if (arr[i] > *max)
            *max = arr[i];
    }
}