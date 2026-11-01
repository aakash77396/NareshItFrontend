#include<stdio.h>
void main(){
    printf("=============================\n");
    printf(" Welcome to Calculator\n");
    printf("=============================\n");

    printf("select 1 for circle\n");
    printf("select 2 for trangle\n");
    printf("select 3 for square\n");
    printf("select 4 for rectangle\n");

    int n;
    scanf("%d",&n);

    switch(n){
        case 1:
        {
            prinf("You are selected circle\n");
            printf("Enter radius:\n");
            double r;
            scanf("%lf",&r);
            printf("Area is : %.2lf", 3.14*r*r);
        }
        break;

        case 2:
        {
            prinf("You are selected trangle\n");
            printf("Enter Base & Height:\n");
            double b;
            double h;
            scanf("%lf %lf",&b, &h);
            printf("Area is : %.2lf", 0.5 * b*h);
        }
        break;
    }

}