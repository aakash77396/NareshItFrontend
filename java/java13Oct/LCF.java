
import java.util.Scanner;

public class LCF {
    public static void main(String[] args) {
        IO.println("Enter two number for LCF: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        for(int i=1 ; true; i++){

            if(b*i % a ==0){
                IO.println("LCF = " + b*i);
                break;
            }
        }
    }
}
