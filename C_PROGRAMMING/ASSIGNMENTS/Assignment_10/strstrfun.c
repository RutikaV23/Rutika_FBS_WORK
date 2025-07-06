#include <stdio.h>
#include <string.h>

int main() {
    char str[] = "apple,banana,mango";
    char *token = strtok(str, ",");

    while (token != NULL) {
        printf("%s\n", token);
        token = strtok(NULL, ",");
    }

    return 0;
}



//strtok() says:
//"Let’s cut this where commas are"
//Then gives you: "apple", "banana", and "mango" one-by-one

