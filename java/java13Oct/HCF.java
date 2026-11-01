import java.util.Scanner;

public class HCF {
    public static void main(String[] args) {
        IO.println("Enter two number for HCF: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int hcf =0;

        for(int i=1; i<=a && i<=b; i++){
            if(a%i==0 && b%i==0){
                hcf = i;
            }
        }
        IO.println("HCF = "+hcf);
    }
}
