#include <stdio.h>

int main() {
    char ch;

    printf("Enter char: ");
    scanf("%c", &ch);

    switch(ch) {

        // Vowels
        case 'a': case 'A':
        case 'e': case 'E':
        case 'i': case 'I':
        case 'o': case 'O':
        case 'u': case 'U':
            printf("Vowel\n");
            break;

        // Special characters
        case '~': case '!': case '@': case '#':
        case '$': case '%': case '^': case '&':
        case '*': case '(': case ')': case '-':
        case '_': case '=': case '+': case ' ': 
            printf("Special character\n");
            break;

        // Alphabets other than vowels
        default:
            if((ch>= 'a' && ch<='z') || (ch>='A' && ch>='Z')){
                printf("constant\n");
            }else printf("other char");
    }

    return 0;
}