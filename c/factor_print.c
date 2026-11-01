#include<stdio.h>
void main(){
    printf("Enter any number: ");
    int num;
    scanf("%d",&num);
    int sum =0;
    for(int i=1;i<=num/2;i++){
        if(num % i ==0){
            sum +=i;
        }
    }
    if(sum == num){
        printf("Perfect number\n");
    }else printf("Not a perfect number\n");
}