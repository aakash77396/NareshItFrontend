#include<stdio.h>
void main(){
    int num;
    printf("enter num: ");
    scanf("%d",&num);

    if(num % 5 ==0){
        printf("divisible by 5\n");
    }else{
        printf("not divisible by 5\n");
    }
}