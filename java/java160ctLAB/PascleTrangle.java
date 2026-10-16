public class PascleTrangle {
    public static void main(String[] args) {
        int star= 1,space=5;
        int unit =1;

        for(int i=1;i<=6;i++){
            // space print
            for(int a=1;a<=space;a++){
                IO.print(" ");
            }
            int x=1;
            int num = i-1;
            int den=1;
            for(int b =1;b<=unit;b++){
                System.out.printf("%3d",x);
                x= (x*num)/den;
                num--;
                den++;
            }
            space--;
            unit++;
            IO.println();
        }
    }
}

