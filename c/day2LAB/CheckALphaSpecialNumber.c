#include <stdio.h>

int main()
{
    char ch;
    printf("Enter Alphabet: ");
    scanf("%c", &ch);

    if (ch == 'a' || ch == 'A' || ch == 'e' || ch == 'E' || ch == 'i' || ch == 'I' || ch == 'o' || ch == 'O' || ch == 'u' || ch == 'U')
    {
        printf("Vowel\n");
    }
    else if (ch == '0' || ch == '1' || ch == '2' || ch == '3' || ch == '4' || ch == '5' || ch == '6' || ch == '7' || ch == '8' || ch == '9' )
    {
        printf("Digit\n");
    }
    else if( ch == '~' || ch == '!' || ch == '@' || ch == '#' || ch == '$' || ch == '%' || ch == '^' || ch == '&' || ch == '*' || ch == '(' || ch == ')' || ch == '_' || ch == '-' || ch == '+' || ch == '+' )
    {
        printf("special char\n");
    }

    return 0;
}