#include<stdio.h>
void main(){
    int n;
    printf("Enter number: ");
    scanf("%d",&n);
    int rem = n%2;
    switch (rem)
    {
        case 0:
            printf("Even\n");
            break;
        default:
            printf("odd\n");
            break;
    }
}