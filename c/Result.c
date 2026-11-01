#include <stdio.h>
void main()
{
    int marks;
    printf("Enter Marks:");
    scanf("%d", &marks);

    if (marks >= 35)
    {
        printf("you passed the exam\n");
    }
    else
    {
        printf("You failed the exam\n");
    }
}