package java30;

import java.util.Scanner;

public class SimpleIntrest {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        IO.println("Enter p r t: ");
        double p = sc.nextDouble();
        double r = sc.nextDouble();
        double t = sc.nextDouble();

        double si = (p*t*r)/100;
        IO.println("Simple Interest = "+ si);
    }
}
