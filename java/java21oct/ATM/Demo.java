package ATM;

import java.util.Scanner;

public class Demo {
    public static void showMenu(){
        IO.println("Welcome to Bank of Cheating..!!");
        IO.println("Enter 1 to deposit");
        IO.println("Enter 2 to Withdraw");
    }
    public static double deposit(double balance, double amount){

        if(amount<=0)IO.println("Invalid deposit amount.");
        else{
            balance+=amount;
            System.out.println("Amount of "+ amount + " is deposited successfully.!!");
        }
        return balance;
    }
    public static double withdraw(double balance, double amount){

        if(amount<=0 || amount>balance)IO.println("Invalid withdraw amount.");
        else{
            balance-=amount;
            System.out.println("Amount of "+ amount + " is withdraw successfully.!!");
        }
        return balance;
    }
    public static void displayBalance(double balance){
        IO.println("Available Balance : "+balance);
    }
    public static void main(String[] args) {
        double initialBalance =5000;
        Scanner sc = new Scanner(System.in);

        showMenu();
        IO.println("Enter choice: ");
        int n = sc.nextInt();
       
        int amount=0;
        if(n==1){
            IO.println("Enter Deposit Amount: ");
            amount = sc.nextInt();
            displayBalance(deposit(initialBalance, amount));
        }else if(n==2){
            IO.println("Enter Withdraw Amount: ");
            amount = sc.nextInt();
            displayBalance(withdraw(initialBalance, amount));
        }else{
            IO.println("Enter valid options..");
        }
    }
}
