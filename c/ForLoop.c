#include<stdio.h>
void main(){
    // int num;
    // printf("Enter number to print their sum : ");
    // scanf("%d",&num);
    int product=1;
    printf("product 1 to 5 is: ");
    for(int i=1;i<=5;i++){
        product *= i;
    }
        printf("%d\n",product);
} 