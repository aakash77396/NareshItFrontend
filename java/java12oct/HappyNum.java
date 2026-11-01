public class HappyNum {
    public static void main(String[] args) {
        int n=320;
        int sum =0;
       while(n !=1 && n!=4){
            // find sum of squares of digits
            while(n!=0){
                int r = n%10;
                sum = sum + (r*r);
                n = n/10;
            }
            n = sum;
            sum =0;
       }

       if(n==1)IO.println("Happy number");
       else IO.println("Not happy number");


    }
}
