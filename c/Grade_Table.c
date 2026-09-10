#include<stdio.h>
void main(){
    char grade;
    printf("Enter Grade: ");
    scanf("%c",&grade);

    if(grade == 'A' || grade =='a'){
        printf("First Rank\n");
    }
    else if(grade == 'B' || grade =='b'){
        printf("Second Rank\n");
    }else if(grade == 'C' || grade =='c'){
        printf("First Class\n");
    }
    else if(grade == 'D' || grade =='d'){
        printf("Second Class\n");
    }else if(grade == 'E' || grade =='e'){
        printf("Just Pass\n");
    }else if(grade == 'F' || grade =='f'){
        printf("Fail\n");
    }else{
        printf("Enter valid Grade\n");
    }
}