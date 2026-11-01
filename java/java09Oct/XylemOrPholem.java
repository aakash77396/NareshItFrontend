package java09Oct;

import java.util.Scanner;

public class XylemOrPholem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        IO.println("Enter num: ");
        int n= sc.nextInt();

        int sum1=0;
        int sum2=0;

        sum1 = n%10;
        n = n/10;

        // while(n!=0){
        //     int r =n%10;
        //     sum1 +=r;
        //     n = n/10;

        //     while(n>9){
        //         int l = n%10;
        //         sum2 += l;
        //         n = n/10;
        //     }
        // }

        while(n>9){
            int r = n%10;
            sum2 +=r;
            n = n/10;
        }

        sum1 +=n;

        if(sum1==sum2) IO.println("XylemOrPholem");
        else IO.println(" Not a XylemOrPholem");
    }
}
