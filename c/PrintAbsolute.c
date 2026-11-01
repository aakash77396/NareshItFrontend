#include<stdio.h>
void main(){
    int n;

    printf("Enter Integer value: ");
    scanf("%d",&n);
    if(n>0){
        printf("Absolute value = %d\n",n);
    }else{
        int pos = -1*n;
        printf("Absolute value = %d\n",pos);
    }
}