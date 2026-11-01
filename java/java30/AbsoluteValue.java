package java30;

import java.util.Scanner;

public class AbsoluteValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        IO.println("Enter number: ");
        int n = sc.nextInt();
        if(n>=0){
            IO.println("Avsolute value = " +n);
        } else IO.println("Avsolute value = " +(-1*n));
    }
}
