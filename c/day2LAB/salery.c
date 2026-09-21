#include<stdio.h>
void main(){
    int sal;
    printf("enter sal: ");
    scanf("%d",&sal);

    

    if(sal<0){
        printf("Invalid salary\n");
    }else if(sal ==0){
        printf("salary is zero\n");
    }else{
        double HRA = (sal * 20)/100;
        double DA = (sal * 10)/100;
        printf("HRA = %.1lf\n",HRA);
        printf("DA = %.1lf\n",DA);
    }
}