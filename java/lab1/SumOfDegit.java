package lab1;

public class SumOfDegit {
    public static void main(String[] args) {
        int digit = 67;

        int sum=0;
        while(digit !=0){
            int r = digit%10;
            sum += r;
            digit = digit/10;
        }
        IO.println("Sum = "+ sum);
    }
}
