public class PascleTrangleStar {
    public static void main(String[] args) {
        int star= 1,space=5;
        int unit =1;

        for(int i=1;i<=6;i++){
            // space print
            for(int a=1;a<=space;a++){
                IO.print(" ");
            }
            for(int b =1;b<=unit;b++){
                IO.print("* ");
            }
            space--;
            unit++;
            IO.println();
        }
    }
}
