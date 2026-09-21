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
    else if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z'))
    {
        printf("Consonant\n");
    }
    else
    {
        printf("Enter valid char\n");
    }

    return 0;
}