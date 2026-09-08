#include<stdio.h>
void main(){
    double p,r,t;
    printf("Enter principle amount:");
    scanf("%lf",&p);
    printf("Enter rate of intrest:");
    scanf("%lf",&r);
    printf("Enter time period in years:");
    scanf("%lf",&t);

    double intrest = (p*t*r)/100;
    printf("Principle Amount = %.2lf\n",p);
    printf("Intrest Amount = %.2lf\n",intrest);
    printf("Total Amount = %.2lf\n", p + intrest);
}