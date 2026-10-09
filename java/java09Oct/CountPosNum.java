package java09Oct;

import java.util.Scanner;

public class CountPosNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        IO.println("Enter num: ");
        int n = sc.nextInt();
        int count =0;
        while (n!=0) { 
            count ++;
            IO.println("Enter num: ");
            n = sc.nextInt();
        }

        IO.println("Count: "+ count);
    }
}
