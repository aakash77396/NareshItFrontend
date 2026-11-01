package java09Oct;

import java.util.Scanner;

public class DuckNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // int count =0;
        // while(n!=0){
        //     int r = n%10;
        //     if(r ==0){
        //         count++;
        //     }

        //     n = n/10;
        // }

        // if(count>0){
        //     IO.println("Duck Number");
        // }else IO.println("Not a Duck Number");
        int p=1;
        while (n !=0) { 
            int r = n%10;
            p *= r;
            n = n/10;
        }

        if(p==0){
            IO.println("Duck Number");
        }else IO.println("Not a Duck Number");


    }
}




