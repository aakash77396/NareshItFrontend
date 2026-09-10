#include<stdio.h>
void main(){
    int a,b;
    char operator;
    printf("%d %d",&a,&b);
    printf("%c",&operator);

    if(operator == '+'){
        printf("Addition = %d\n ",a+b);
    }else if(operator == '-'){
        printf("Substraction = %d\n",a-b);
    }
    else if(operator == '*'){
        printf("Multiplication = %d\n",a*b);
    }else if(operator == '/'){
        if(b ==0){
            printf("Enter valid b value\n");
        }else{
            printf("Divisions = %.2f\n",a/b);
        }
    }else if(operator == '%'){
        printf("Modulas = %d",a%b);
    }else{
        printf("Enter valid operator");
    }
}