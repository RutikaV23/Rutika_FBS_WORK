#include <stdio.h>
#include <string.h>

void myStrrev(char str[]) {
    int i = 0;
    int j = strlen(str) - 1;
    char temp;
    
    while (i < j) {
        temp = str[i];
        str[i] = str[j];
        str[j] = temp;
        i++;
        j--;
    }
}

void main() {
    char str[] = "hello";
    myStrrev(str);
    printf("Reversed string: %s", str);  // Output: "olleh"
    
}
