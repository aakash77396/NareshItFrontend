#include<stdio.h>
void main(){
    double price,discountPercentage;
    printf("======================================\n");
    printf("Welcome to the Aakash Shop\n");
    printf("======================================\n");

    printf("Enter Amount of product: ");
    scanf("%lf",&price);
    printf("Enter Discount Percentage on product: ");
    scanf("%lf",&discountPercentage);
    printf("======================================\n");

    printf("You saved Amount! %.2lf\n",(price*discountPercentage/100));
    printf("Paid Amount! %.2lf\n", price - (price*discountPercentage/100));

}