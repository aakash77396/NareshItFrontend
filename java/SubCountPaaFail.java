import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SubCountPaaFail {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter num:");

        List<Integer> arr = new ArrayList<>();
        arr.add(sc.nextInt());
        int pass=0;
        int fail=0;
        for(int n: arr){
            if(n>=35){
                pass++;
            }else{
                fail++;
            }
        }
        System.out.println("Pass in " + pass +"subject and fail in "+ fail +" subject. ");
    
    }
}
