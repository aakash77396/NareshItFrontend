#include<stdio.h>
void main(){
    char ch;
    printf("Enter any char: ");
    scanf("%c",&ch);

    switch(ch){
        case 'A': case 'a':
            printf("Alphabet\n");
            break;
        case 'E': case 'e':
            printf("Alphabet\n");
            break;
        case 'I': case 'i':
            printf("Alphabet\n");
            break;
        case 'O': case 'o':
            printf("Alphabet\n");
            break;
        case 'U': case 'u':
            printf("Alphabet\n");
            break;
        default:
            printf("Not Alphabet\n");
    }
}