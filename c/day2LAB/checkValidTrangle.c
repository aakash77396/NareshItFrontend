#include<stdio.h>
void main(){
    int a,b,c;
    printf("enter three sides of trangle: ");
    scanf("%d%d%d",&a,&b,&c);

    if((a+b >c) && a+c > b && b+c >a){
        printf("valid trangle\n");
    }else{
        printf("not valid trangle\n");
    }
}