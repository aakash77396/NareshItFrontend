package ClassPractices;
import java.lang.*;
public class IoInput {
    public static void main(String[] args) {
        System.out.println("Enter  numbers: ");
        int a = Integer.parseInt(IO.readln());
        System.out.println("Enter  numbers: ");
        int b = Integer.parseInt(IO.readln());

        IO.println("Sum = " + (a+b));
    }
}
