public class Pattern1 {
    public static void main(String[] args) {
        /*
        1   6   11   16  
        2   7   12   17
        3   8   13   18
        4   9   14   19
        5   10  15   20
        */
        for (int i = 1; i <= 5; i++) {
            int n=i;
            for(int j=0;j<4;j++){
                System.out.print("  "+n +"  ");
                n+=5;
            }
            IO.println();
        }
    }
}
