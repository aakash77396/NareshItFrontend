#include<stdio.h>
void main(){
    char ch;
    printf("Enter Alphabet: ");
    scanf("%c",&ch);

    switch (ch)
    {
        case 'a': case 'A': case 'e': case 'E': case 'i': case 'I': case 'o': case 'O': case 'u': case 'U': printf("Vowel");
        break;
        default: printf("Enter valid alphabet");
        break;
    }
}