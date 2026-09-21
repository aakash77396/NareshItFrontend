#include<stdio.h>
void main(){
    int n;
    printf("Enter number: ");
    scanf("%d",&n);

    if(n>0){
        printf("Possitive number\n");
    }else if(n<0){
        printf("Negative number\n");
    }else{
        printf("zero\n");
    }
}