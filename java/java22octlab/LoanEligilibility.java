import java.util.Scanner;

public class LoanEligilibility {
    public static void displayBankName(){
        IO.println("Aakash Bank");
    }
    public static boolean  isEligible(double monthlySalary, int age){
        if(monthlySalary>=25000 && (age>21 && age<=60)) return true;
        else return false;
    }
    public static double calculateLoanAmount(double monthlySalary){
        return monthlySalary*20;
    }
    public static double calculateEMI(double principal, int months){
        double totalInterset = principal* 0.12 * (months/12.0);
        double rePayment = principal + totalInterset;
        double EMI = rePayment/months;
        IO.println("Loan tenure: "+months +" Months");
        IO.println("Total interest: Rs. "+totalInterset);
        IO.println("Total repayment: Rs. "+rePayment);
        return EMI;
    }
    public static void displayLoanDetails(double monthlySalary, int age, int months){
        displayBankName();
        IO.println("Loan eligibility: "+isEligible(monthlySalary, age));
        IO.println("Eligible loan amount: Rs. "+calculateLoanAmount(monthlySalary));
        IO.println("Monthly EMI: Rs. "+calculateEMI(monthlySalary, months));
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        IO.println("Enter monthly salary: ");
        double salary = sc.nextDouble();

        IO.println("Enter age: ");
        int age = sc.nextInt();

        IO.println("Enter loan tenure in months: ");
        int months = sc.nextInt();

        displayLoanDetails(salary, age, months);
    }
}
