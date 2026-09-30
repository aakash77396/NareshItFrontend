package ClassPractices;
import java.util.Scanner;

public class ReverseNum {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter num:");
        int num = sc.nextInt();
        for(int i=num;i>=1;i--){
            System.out.println(i);
        }
    }
}

