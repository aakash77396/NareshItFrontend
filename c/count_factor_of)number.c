#include<stdio.h>
void main(){
    printf("Enter any number: ");
    int num;
    scanf("%d",&num);
    int count =0;
    for(int i=1;i<=num;i++){
        if(num % i ==0){
            count++;
        }
    }
    
    if(count ==2){
        printf("Prime Number\n");
    }else printf("not prime number\n");
}