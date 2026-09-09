#include <stdio.h>
void main()
{
    double age;
    printf("Enter age:");
    scanf("%lf", &age);

    if (age > 0)
    {
        if (age >= 18)
        {
            printf("You are eligible for Voting!\n");
        }
        else
        {
            printf("You are Not eligible for Voting! wait %.1lf Years\n", 18.0 - age);
        }
    }
    else
    {
        printf("Enter valid Age");
    }
}