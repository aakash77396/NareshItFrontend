#include<stdio.h>
int main(){
    char ch;
    printf("enter char: ");
    scanf("%c",&ch);

    if((ch>='a' && ch<='z')){
        printf("LowerCase\n");
    } else if((ch>='A' && ch<='Z')){
        printf("UpperCase\n");
    }else{
        printf("enter valid char \n");
    }
}