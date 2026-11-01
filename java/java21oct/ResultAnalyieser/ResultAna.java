package ResultAnalyieser;

import java.util.Scanner;

public class ResultAna {
    public static void displayTitle(){
        IO.println("Student Result Analyzer");
    }
    public static int calculateTotal(int m1, int m2, int m3){
        return m1 + m2 + m3;
    }
    public static double calculatePercentage(int total){
        return (total/300.0)*100.0;
    }
    public static void displayPercentage(double percentage){
        if(percentage>=75)IO.println("Result: Distinction");
        else if(percentage>60)IO.println("Result: First class");
        else if(percentage>35)IO.println("Result: Pass");
        else IO.println("Result: Fail");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        IO.println("Enter Three Marks: ");
        int m1=sc.nextInt();
        int m2=sc.nextInt();
        int m3=sc.nextInt();
        displayTitle();
        displayPercentage(calculatePercentage(calculateTotal(m1, m2, m3)));
    }
}
