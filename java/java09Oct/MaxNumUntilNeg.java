package java09Oct;

import java.util.Scanner;

public class MaxNumUntilNeg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Num: ");
        int n = sc.nextInt();

        int max = n;
        while(n>0){
            if(n>max){
                max = n;
            }
            System.out.println("Enter Num: ");
            n = sc.nextInt();
        }
        System.out.println("Max: " + max);

    }
}
