#include<stdio.h>
void main(){
    int n;
    // this the label
    start_loop:
    printf("Select an option: \n1. Turn ON the Light\n2. Turn OFF the Light\n3. Turn ON the AC\n4. Turn OFF the AC: ");
    scanf("%d",&n);

    switch (n)
    {
    case 1:
        printf("Light is now ON.\n");
        // goto start_loop;
        break;
    case 2:
        printf("Light is now OFF.\n");
        break;
    case 3:
        printf("AC is now ON.\n");
        break;
    case 4:
        printf("AC is now OFF.\n");
        break;
    default:
        printf("Invalid choice! Please enter 1, 2, 3, or 4.\n");
        goto start_loop;
        break;
    }
    
}