#include<stdio.h>
void main(){
    int n1,n2;
    printf("Enter two numbers: ");
    scanf("%d%d", &n1, &n2);

    int res;
    if(n1>n2){
        res =0;
    }else res =1;

    switch (res)
    {
        case 0:
            printf("Max = %d\n",n1);
            break;
        case 1:
            printf("Max = %d\n",n2);
            break;
        default:
            printf("error\n");
            break;
    }
}