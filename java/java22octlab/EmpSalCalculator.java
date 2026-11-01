import java.util.Scanner;

public class EmpSalCalculator {
    public static double  calculateHRA(double basicSallery){
        return basicSallery*0.2;
    }
    public static double  calculateDA(double basicSallery){
        return basicSallery*0.1;
    }
    public static double  calculatePF(double basicSallery){
        return basicSallery*0.12;
    }
    public static double  calculateTakeHomeSalary(double basicSallery){
        double takeHomeSal = basicSallery + calculateHRA(basicSallery) + calculateDA(basicSallery) - calculatePF(basicSallery);
        return takeHomeSal;
    }
    public static void  displaySalarySlip(double basicSallery){
       IO.println("Basic salary: Rs.: "+basicSallery );
       IO.println("HRA: Rs.: "+calculateHRA(basicSallery) );
       IO.println("DA: Rs.: "+calculateDA(basicSallery) );
       IO.println("PF deduction: Rs.: "+calculatePF(basicSallery));
       IO.println("Taken-Home-Salary: "+calculateTakeHomeSalary(basicSallery));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        IO.println("Enter basic salary: ");
        double n = sc.nextDouble();
        displaySalarySlip(n);
    }
}
