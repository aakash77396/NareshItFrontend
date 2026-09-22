import java.util.Scanner;

public class PrevMul {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter num:");
        int num = sc.nextInt();

        int rem = num %100;
        System.out.println(num -rem);
    }
}
