#include<stdio.h>
void main(){
    int a,b,c,d,e;
    printf("enter five sub marks: ");
    scanf("%d%d%d%d%d",&a,&b,&c,&d,&e);

    int per = (a+b+c+d+e)*100/500;

    if(per >=90){
        printf("Grade A\n");
    }else if(per >=80){
        printf("Grade B\n");
    }else if(per >=70){
        printf("Grade C\n");
    }else if(per >=60){
        printf("Grade D\n");
    }else if(per >=40){
        printf("Grade E\n");
    }else if(per <40){
        printf("Grade F\n");
    }
}