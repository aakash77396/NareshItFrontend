#include<stdio.h>
void main(){
    int n;
    printf("Enter number to check +ve, -ve, neutral: ");
    scanf("%d",&n);
    if(n>0){
        printf("Positive Number\n");
    }else if(n<0){
        printf("Negative\n");
    }else{
        printf("Neutral\n");
    }
}