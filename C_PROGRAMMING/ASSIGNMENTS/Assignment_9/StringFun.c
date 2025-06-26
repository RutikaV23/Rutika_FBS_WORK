#include <stdio.h>
#include <string.h>

int main() {
    char str1[20] = "Hello";
    char str2[20] = "World";

    // Length of a string
    printf("Length: %lu\n", strlen(str1));

    // Copy string
    strcpy(str1, str2);
    printf("Copied str1: %s\n", str1);

    // Concatenate
    strcat(str1, "!!!");
    printf("Concatenated: %s\n", str1);

    // Compare
    int cmp = strcmp("abc", "abd");
    printf("Comparison: %d\n", cmp);

    // Find character
    char *ptr = strchr(str1, 'o');
    if (ptr) printf("Found 'o' at: %s\n", ptr);

    return 0;
}
