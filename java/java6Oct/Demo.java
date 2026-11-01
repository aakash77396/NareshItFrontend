package java6Oct;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        IO.println("Enter min,max number: ");
        int a =sc.nextInt();
        int b =sc.nextInt();
        for(int i=a;i<=b;i++){
            System.out.println(i);
        }
    }
}
