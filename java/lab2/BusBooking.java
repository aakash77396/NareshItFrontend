import java.util.Scanner;

public class BusBooking {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        IO.println("Enter number of seat: ");
        int n = sc.nextInt();
        IO.println("Enter Age: ");
        int age = sc.nextInt();

        double discount = (age>65 && age<=100) ? (n*300)*0.2 : 0.00;

        IO.println("Total cost before discount: Rs. " + (n*300));
        IO.println("Discount amount: Rs.  " + discount);
        IO.println("Total cost after discount: " + ((n*300) - discount));

    }
}
