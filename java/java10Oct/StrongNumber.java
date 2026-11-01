package java10Oct;

import java.util.Scanner;

public class StrongNumber {
    public static void main(String[] args) {
        IO.println("Enter Num: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int temp =n;
        int sum=0;
        while(temp!=0){
            int r = temp%10;
            int fac=1;
            for(int i=r;i>=1;i--){
                fac *=i;
            }
            sum +=fac;
            temp = temp/10;
        }

        if(sum==n) IO.println("Strong Number");
        else IO.println("Not Strong Number");


    }
}
