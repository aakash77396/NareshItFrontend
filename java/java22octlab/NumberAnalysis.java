import java.util.Scanner;

public class NumberAnalysis {
    public static int countNumber(int n){
        int count =0;
        while(n!=0){
            count++;
            n = n/10;
        }
        return count;
    }

    public static int findSumOfDigits(int n){
        int sum=0;
        while(n!=0){
            int r= n%10;
            sum +=r;
            n = n/10;
        }
        return sum;
    }

    public static int reverseNumber(int n){
        int reverse =0;
        while(n!=0){
            int r =n%10;
            reverse = reverse*10 + r;
            n = n/10;
        }
        return  reverse;
    }

    public static boolean  isPalindrome(int n){
        int reverse =0;
        int temp =n;
        while(n!=0){
            int r =n%10;
            reverse = reverse*10 + r;
            n = n/10;
        }
        if(reverse==temp) return  true;
        else return false;
    }

    public static void displayAnalysis(int n){
        IO.println("Number of digits: " + countNumber(n));
        IO.println("Sum of digits: " + findSumOfDigits(n));
        IO.println("Reversed number: " + reverseNumber(n));
        IO.println("Is palindrome: " + isPalindrome(n));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        IO.println("Enter a positive number: ");
        int n = sc.nextInt();
        displayAnalysis(n);
    }
}
