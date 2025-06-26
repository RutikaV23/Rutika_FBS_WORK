#include <stdio.h>
#include <string.h>

int main() {
    char str[] = "hello world";
    char ch = 'o';

    char *ptr = strchr(str, ch);

    if (ptr != NULL) {
        printf("First occurrence of '%c' found at position: %ld\n", ch, ptr - str);
        printf("Substring from first '%c': %s\n", ch, ptr);
    } else {
        printf("Character not found.\n");
    }

    return 0;
}
