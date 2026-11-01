public class ReverseNum {
    public static void main(String[] args) {
        int n = 123;
        int sum =0;
        while(n !=0){
            int r = n%10;
            sum = (sum*10) +r;
            n = n/10;
        }

        IO.println(sum);
    }
}
