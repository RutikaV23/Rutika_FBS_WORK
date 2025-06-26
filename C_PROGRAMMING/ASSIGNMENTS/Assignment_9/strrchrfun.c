#include <stdio.h>
#include <string.h>

int main() {
    char str[] = "hello world";
    char *ptr = strrchr(str, 'o');

    if (ptr != NULL) {
        printf("Last 'o' found at: %ld\n", ptr - str);
        printf("Substring from last 'o': %s\n", ptr);
    } else {
        printf("Character not found.\n");
    }

    return 0;
}

//ptr - str means:
//"How many letters from the beginning of the string until I find the character?"

