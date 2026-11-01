#include<stdio.h>
void main(){
    int total=0;
    for(int i=1;i<=100;i++){
        int count =0;
        for(int j=1;j<=i;j++){
            if(i%j ==0){
                count++;
            }
        }
        if(count ==2){
            printf("%d\n",i);
            total++;
        }
    }
    printf("Total prime number = %d\n",total);
}