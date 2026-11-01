public class Pattern02 {
    public static void main(String[] args) {
        /* 
        1   2   3   4   5
        10  9   8   7   6
        11  12  13  14  15
        20  19  18  17  16
        */

        int r=4, c=5;
        int x=1;
        for(int i=1;i<=r;i++){
            for(int j=1;j<=c;j++){
                if(i%2!=0){
                    System.out.printf("%4d",x++);
                }else{
                    System.out.printf("%4d",--x);
                }
            }
            x = x +c;
            IO.println();
            
        }
    }
}
