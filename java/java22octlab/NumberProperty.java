
import java.util.Scanner;

class NumberProperty{
    public static int factorCount(int n){
        int count=0;
        for(int i=1;i<=n;i++){
            if(n%i==0) count++;
        }
        return  count;
    }
    public static int findFactorSum(int n){
        int sum=0;
        for(int i=1;i<=n;i++){
            if(n%i==0) sum+=i;
        }
        return  sum;
    }
    public static boolean  isPerfectNumber(int n){
        int sum=0;
        for(int i=1;i<n;i++){
            if(n%i==0) sum+=i;
        }
        if(sum ==n) return true;
        else return false;
    }
    public static boolean isPrimeNumber(int n){
        int count=0;
        for(int i=1;i<=n;i++){
            if(n%i==0) count++;
        }
        if(count ==2) return true;
        else return false;
    }
    public static void displayAnalysis(int n){
        IO.println("Number of factors: "+factorCount(n));
        IO.println("Sum of factors: "+findFactorSum(n));
        IO.println("Is perfect number: "+isPerfectNumber(n));
        IO.println("Is prime number: "+isPrimeNumber(n));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        IO.println("Enter a positive number: ");
        int n = sc.nextInt();
        displayAnalysis(n);
    }
}