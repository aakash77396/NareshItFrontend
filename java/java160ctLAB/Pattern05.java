public class Pattern05 {
    public static void main(String[] args) {
       
        int r=6,c=6;
        int a=6;
        for(int i=1;i<=r;i++){
             int x=i;
            for(int j=1;j<=c;j++){
                IO.print(x + " ");
                x+=a;
                a--;
            }
            c--;
            a=6;
            IO.println();
        }
    }
}
