package ClassPractices;

import java.util.Scanner;

public class Trangle {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter three sides of trangle: ");

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if (a == b && b == c) {
            System.out.println("The trangle is equilateral.");
        } else if (a == b || a == c || b == c) {
            System.out.println("The trangle is isosceles.");
        } else if (a != b && b != c && a != c) {
            if (a + b >= c && a + c > b && b + c > a) {
                System.out.println("The trangle is not valid.");
            }else System.out.println("The trangle is scalene.");
        }
    }
}
