import java.util.Scanner;

public class Factor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        IO.println("Enter any number: ");
        int n= sc.nextInt();

        int sum =0;
        for(int i=1;i<=n/2;i++){
            if(n%i==0) sum +=i;
        }

        if(sum==n) IO.println("Perfect number");
        else IO.println("Not a perfect number");
    }
}
