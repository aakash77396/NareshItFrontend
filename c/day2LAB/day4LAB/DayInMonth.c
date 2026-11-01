#include<stdio.h>
void main(){
    int m;
    printf("Enter month number(1-12): ");
    scanf("%d",&m);
    int d1=30;
    int d2=31;
    switch(m){
        case 1:
            printf("%d days",d2);
            break;
        case 2:
            printf("%d days",28);
            break;
        case 3:
            printf("%d days",d2);
            break;
        case 4:
            printf("%d days",d1);
            break;
        case 5:
            printf("%d days",d2);
            break;
        case 6:
            printf("%d days",d1);
            break;
        case 7:
            printf("%d days",d2);
            break;
        case 8:
            printf("%d days",d2);
            break;
        case 9:
            printf("%d days",d1);
            break;
        case 10:
            printf("%d days",d2);
            break;
        case 11:
            printf("%d days",d1);
            break;
        case 12:
            printf("%d days",d2);
            break;
        default:
            printf("Enter valid number\n");
            break;
    }
}