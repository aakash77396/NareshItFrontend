#include<stdio.h>
void main(){
    int n;
    printf("Enter a number:");
    scanf("%d",&n);

    if(n % 2 ==0){
        printf("%d Even Number\n",n);
    }else{
        printf( "%d Odd Number\n",n);
    }
}