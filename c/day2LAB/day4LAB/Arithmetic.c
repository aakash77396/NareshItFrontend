#include<stdio.h>
void main(){
    int n1,n2;
     char ch;
    printf("Enter two numbers: ");
    scanf("%d%d", &n1, &n2);
    printf("Enter operator( +,-,*,/,% ): ");
    scanf(" %c",&ch);
    

    switch (ch)
    {
        case '+':
            printf("Addition = %d\n",n1 +n2);
            break;
        case '-':
            printf("Substraction = %d\n",n1-n2);
            break;
        case '*':
            printf("Multiplication = %d\n",n1*n2);
            break;
        case '/':
            printf("Division = %d\n",n1/n2);
            break;
        case '%':
            printf("Reminder = %d\n",n1%n2);
            break;
        default:
            printf("enter valid operator\n");
            
    }
}