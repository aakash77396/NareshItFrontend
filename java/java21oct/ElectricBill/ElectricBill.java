package ElectricBill;
import java.util.Scanner;


public class ElectricBill {

    public static void displayWelcome(){
        IO.println("Welcome..!");
    }
    public static double calculateBill(int unit){
        int result =0;
        if(unit>0 && unit<=100){
            result= unit*2;
        }else if(unit>100 && unit<=200){
            result= 100*2 + (unit-100)*3;
        }else{
            result = 100*2 + 100*3 + (unit-200);
        }
        return result;
    }
    public static void displayBill(double amount){
        IO.println("Final bill = "+amount);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         IO.println("Enter unit: ");
        int n = sc.nextInt();
        displayWelcome();
        double bill = calculateBill(n);
        displayBill(bill);
    }
}
