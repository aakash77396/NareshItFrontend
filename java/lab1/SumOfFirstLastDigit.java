package lab1;

public class SumOfFirstLastDigit {
    public static void main(String[] args) {
        int n= 657;

        int sum =0;
        while(n!=0){
            int r= n%10;
            sum +=r;
             n = n/100;
        }
        IO.println("Sum = "+ sum);
    }
}
