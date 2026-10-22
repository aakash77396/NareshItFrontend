import java.util.Scanner;

public class ShopingDiscount {

    public static void displayStoreName(){
        IO.println("Welcome to AAKASH Shop");
    }
    public static double  calculateDiscount(double amount){
        double discount=0.0;

        if(amount<1000){
            discount=0;
        }else if(amount>=1000 && amount<5000){
            discount = amount*0.1;
        }else if(amount>=5000){
            discount = amount*0.2;
        }
        return discount;
    }
    public static double  calculateTax(double amount) {
        double discount = calculateDiscount(amount);
        double tax =(amount-discount)*0.05;
        return tax;
    }
    public static double  calculateFinalAmount(double amount) {
        double discount = calculateDiscount(amount);
        double tax = calculateTax(amount);
        return (amount - discount) + tax;
    }
    public static void printBill(double amount) {
        displayStoreName();
        IO.println("Original amount: "+amount);
        IO.println("Discount: Rs. "+calculateDiscount(amount));
        IO.println("Amount after discount: Rs. "+ (amount- calculateDiscount(amount)));
        IO.println("Tax (5%): "+calculateTax(amount));
        IO.println("Final amount: "+calculateFinalAmount(amount));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        IO.println("Enter shopping amount: ");
        double amount = sc.nextDouble();
        printBill(amount);
    }
}
