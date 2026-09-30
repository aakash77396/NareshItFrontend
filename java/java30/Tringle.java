package java30;

import java.util.Scanner;

public class Tringle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        IO.println("Enter trangle b an h: ");
        double b = sc.nextDouble();
        double h = sc.nextDouble();

        IO.println("Area of Trangle: "+ (0.5*b*h));

    }
}
