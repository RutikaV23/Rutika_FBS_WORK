#include <stdio.h>
#include <stdlib.h>

void mergeArrays(int *, int *, int *, int );
void displayArray(int *, int );

void main() {
    int *arr1, *arr2, *arr3;
    int size;

    printf("Enter size of arrays: ");
    scanf("%d", &size);

    arr1 = (int *)malloc(size * sizeof(int));
    arr2 = (int *)malloc(size * sizeof(int));
    arr3 = (int *)malloc(2 * size * sizeof(int));  
    
    if (arr1 == NULL || arr2 == NULL || arr3 == NULL) {
        printf("Memory allocation failed!");
        return;
    }

    printf("Enter elements of Array 1:\n");
    for (int i = 0; i < size; i++) {
        scanf("%d", &arr1[i]);
    }

    printf("Enter elements of Array 2:\n");
    for (int i = 0; i < size; i++) {
        scanf("%d", &arr2[i]);
    }

    mergeArrays(arr1, arr2, arr3, size);

    printf("Merged Array:\n");
    displayArray(arr3, 2 * size);

    free(arr1);
    free(arr2);
    free(arr3);
}

void mergeArrays(int *arr1, int *arr2, int *arr3, int size) {
    for (int i = 0; i < size; i++) {
        arr3[i] = arr1[i];
    }
    for (int i = 0; i < size; i++) {
        arr3[i + size] = arr2[i];
    }
}

void displayArray(int *arr, int size) {
    for (int i = 0; i < size; i++) {
        printf("%d ", arr[i]);
    }
    printf("\n");
}
